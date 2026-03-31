package com.Utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.code.Customer;
import com.code.ServicePlan;

public class Utility {


	
	public static List<Customer> getAllCustomer() {
		
		List<Customer> customers = new ArrayList<Customer>();
		// empty:true size:0
		
	//	customers = new ArrayList<>(1024);
		customers.add(new Customer("Sujal","sujal10@gmail.com",ServicePlan.valueOf("Gold".toUpperCase()),LocalDate.parse("2003-08-08"),"Sujal@018",20000));
		customers.add(new Customer("Omkar","omkar08@gmail.com",ServicePlan.valueOf("Gold".toUpperCase()),LocalDate.parse("2001-08-08"),"Omkar@0010",1000));
		customers.add(new Customer("adii","adii1@gmail.com",ServicePlan.valueOf("DIAMOND".toUpperCase()),LocalDate.parse("2000-07-12"),"Adi@018",20000));
		customers.add(new Customer("jytoii","jtmore1@gamil.com",ServicePlan.valueOf("PLATINUM".toUpperCase()),LocalDate.parse("2019-04-08"),"jt@0010",1000));
		return customers;
	}
}
