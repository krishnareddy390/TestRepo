package com.practice.Webservice1;

import java.sql.Date;

import com.practice.Webservice1.entity.Tax;
import com.practice.Webservice1.entity.User;

public interface UserService {
	
	public String addUser(User user);
	public Tax getTaxData(Date date);

}
