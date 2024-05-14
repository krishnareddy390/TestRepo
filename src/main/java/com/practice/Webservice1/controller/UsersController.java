package com.practice.Webservice1.controller;



import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Webservice1.entity.Tax;
import com.practice.Webservice1.entity.User;
import com.practice.Webservice1.service.impl.UserServiceImpl;

@RestController
public class UsersController {
	
	@Autowired
	private UserServiceImpl service;
	

	   
	   @PostMapping(value="/saveData",consumes = "application/json",produces = "application/json")
	   public ResponseEntity<String> saveData(@RequestBody User user) {
			   String response = service.addUser(user);
			return new ResponseEntity<String>(response,HttpStatus.CREATED);
		}
	   
	   
	   
	   @GetMapping(value="/getTaxData/{date}",produces = "application/json")
	   public ResponseEntity<Tax> getTaxdata(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
		   Tax t = service.getTaxData(date);
		   return new ResponseEntity<Tax>(t,HttpStatus.OK);
	   }
	   
	   
	   

}
