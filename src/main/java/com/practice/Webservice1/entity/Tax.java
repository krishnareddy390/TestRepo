package com.practice.Webservice1.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tax")
public class Tax {
	
	@Id
	private String empCode;
	private String firstName;
	private String lastName;
	private Double yeralySal;
	private Double taxAmount;
	private Double cessAmount;
	 @Temporal(TemporalType.DATE)
	 @Column(name="date")
	private LocalDate date;
	
	
	public Tax(String empCode, String firstName, String lastName, Double yeralySal, Double taxAmount,
			Double cessAmount,LocalDate date) {
		super();
		this.empCode = empCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yeralySal = yeralySal;
		this.taxAmount = taxAmount;
		this.cessAmount = cessAmount;
		this.date = date;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getYeralySal() {
		return yeralySal;
	}
	public void setYeralySal(Double yeralySal) {
		this.yeralySal = yeralySal;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Double getCessAmount() {
		return cessAmount;
	}
	public void setCessAmount(Double cessAmount) {
		this.cessAmount = cessAmount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	

}
