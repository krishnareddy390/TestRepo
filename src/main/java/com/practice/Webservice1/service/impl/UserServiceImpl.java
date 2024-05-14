package com.practice.Webservice1.service.impl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Webservice1.UserService;
import com.practice.Webservice1.entity.Tax;
import com.practice.Webservice1.entity.User;
import com.practice.Webservice1.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;


	@Override
	public String addUser(User user) {
		
		if (!(repository.existsById(user.getEmpid()))) {
			repository.saveAndFlush(user);
			return "Record added in database";
		} else
			return "Record not added in database";
	}


	@Override
	public Tax getTaxData(Date date) {
		
		Tax tx = repository.getTaxAmount(date);
		if (tx.getYeralySal() >= 250001 && tx.getYeralySal() <=500000 ) {
			tx.setTaxAmount((tx.getYeralySal()*5/100)*2/100);
		}else if(tx.getYeralySal() >= 5000001  && tx.getYeralySal() <=1000000) {
			tx.setTaxAmount((tx.getYeralySal()*10/100)*2/100);
		}else if(tx.getYeralySal() > 1000000 ) {
			tx.setTaxAmount((tx.getYeralySal()*20/100)*2/100);
		}
		
		return tx;
		
	}

}
