package com.validate;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.code.Customer;
import com.code.ServicePlan;
import com.customvalidation.CustomeValidation;
import com.service.Service;

public class Validation {
	
	public static void emailverification(String email) throws CustomeValidation{
		
		String regex="^[\\w!#$%&'*+/=?^`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^`{|}~-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
		if(!email.matches(regex)) {
			throw new CustomeValidation("brooo plsss enter correct mail");
		}
		
		
	}

	
	public static void passwordverifcation(String password) throws CustomeValidation {
		
		// Breakdown:
	    // ^                 : Start of string
	    // (?=.*[0-9])       : Must contain at least one digit
	    // (?=.*[a-z])       : Must contain at least one lowercase letter
	    // (?=.*[A-Z])       : Must contain at least one uppercase letter
	    // (?=.*[@#$%^&+=!]) : Must contain at least one special character
	    // (?=\S+$)          : No whitespace allowed
	    // .{8,20}           : Length between 8 and 20 characters
	    // $                 : End of string
		
		String Password="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$";
		if(!password.matches(Password))
		{
			throw new CustomeValidation("brooo plsss enter correct Password ");
		}
		
		
		
			
		
	}
	

		
		public static void verifyPlan(ServicePlan plan, int amount) throws CustomeValidation {

		    if (amount < plan.getCharges()) {
		        throw new CustomeValidation(
		            "Amount is less for " + plan +
		            ". Required: " + plan.getCharges()
		        );
		    }
		}
		
		
		
		public static void checkDuplicateEmail(String email, List<Customer> list)
		        throws CustomeValidation {
			 Customer c = new Customer(email);
		   if(list.contains(c)) {
			   throw new CustomeValidation("Email are already Present please enter new mail id" );
//			   
//			   for (Customer c : list) {
//				    if (c.getEmail().equalsIgnoreCase(email)) {
//				        throw new CustomeValidation("Email already exists");
//				    }
//				}
		   
		}
			
			
			
			
			
			
			
		}
	}
	

	
	
	
	

