package com.practice.Webservice1.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practice.Webservice1.entity.Tax;
import com.practice.Webservice1.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("select * from Tax t where t.date <= :createDate")
    public Tax getTaxAmount(@Param("createDate") Date createDate);


}
