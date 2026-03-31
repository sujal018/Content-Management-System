package com.code;

import java.time.LocalDate;

public class Customer {

	private int id;
	private String name;
	private String email;
	private ServicePlan service_plan;
	private LocalDate date;
	private String password;
	private int registerationamount;
	private static int idcounter;
	
	
	static{
		idcounter=101;
	}


	public Customer(String name, String email, ServicePlan service_plan, LocalDate date, String password,
			int registerationamount) {
		super();
		id=idcounter;
		idcounter++;
		this.name = name;
		this.email = email;
		this.service_plan = service_plan;
		this.date = date;
		this.password = password;
		this.registerationamount = registerationamount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public ServicePlan getService_plan() {
		return service_plan;
	}


	public void setService_plan(ServicePlan service_plan) {
		this.service_plan = service_plan;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getRegisterationamount() {
		return registerationamount;
	}


	public void setRegisterationamount(int registerationamount) {
		this.registerationamount = registerationamount;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", email=" + email + ", service_plan=" + service_plan
				+ ", date=" + date + ", password=" + password + ", registerationamount=" + registerationamount ;
	}


	@Override
	public int hashCode() {
		
		return this.email.hashCode();
	}


	@Override
	public boolean equals(Object o) {
		if(o instanceof Customer) {
			Customer cust=(Customer)o;
			return this.email.equals(cust.email);
		}
		else return false;
	}


	public Customer(String email) {
		super();
		this.email = email;
	}
	
	
	
}
