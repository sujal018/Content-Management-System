package com.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Utility.Utility;
import com.code.Customer;
import com.code.ServicePlan;
import com.customvalidation.CustomeValidation;
import com.validate.Validation;

public class Service {
	public Service() {
		list = Utility.getAllCustomer();
	}

	static Scanner sc = new Scanner(System.in);
	static List<Customer> list = new ArrayList<>();

	public static void show() {
		for (Customer c : list) {
			System.out.println(c);
		}
	}

	public static void add(String name, String email, ServicePlan service_plan, LocalDate date, String password,
			int registerationamount) throws CustomeValidation {

		Validation.emailverification(email);
		Validation.passwordverifcation(password);
        Validation.verifyPlan(service_plan, registerationamount);
        Validation.checkDuplicateEmail(email, list);
        
		Customer obj = new Customer(name, email, service_plan, date, password, registerationamount);
		list.add(obj);

	}

	public static void Login() {
		System.out.println("Enter Mail Id : ");
		String mail = sc.next();
		System.out.println("Enter the Pwd");
		String pwd = sc.next();

	Customer cust = new Customer(mail);
		int ind = list.indexOf(cust);
		 if(ind !=-1) {
			 Customer custmer = list.get(ind);
			 if(pwd.equals(custmer.getPassword())) {				 
				 System.out.println("Login Successfully");
				 System.out.println(custmer);
			 }
		  
		   }else {
			   System.out.println(" Incorrect   Deatils brooo pls enter Correct Details !!!!");
		  
		  }
		

		/*for (Customer c : list) {
//			if (mail.equals(c.getEmail()) && pwd.equals(c.getPassword())) {
				if (c.getEmail().equals(mail) && pwd.equals(c.getPassword())) {
				System.out.println(c);
				System.out.println("Login Successfully");
			}
		}
	}*/
	}
	public static void UpdateMail() throws CustomeValidation {
		  /*  System.out.println("Enter Mail Id : ");
		    String mail = sc.next();

		    System.out.println("Enter the Pwd");
		    String pwd = sc.next();

		    Customer cust = list.stream()
		            .filter(c -> c.getEmail().equalsIgnoreCase(mail))
		            .findFirst()
		            .orElse(null);

		    if (cust != null) {

		        if (cust.getPassword().equals(pwd)) {

		            System.out.println("Enter New Password:");
		            String newPwd = sc.next();

		            Validation.passwordverifcation(newPwd);
		            cust.setPassword(newPwd);

		            System.out.println("Password Updated Successfully");

		        } else {
		            System.out.println("Incorrect Password");
		        }

		    } else {
		        System.out.println("Email not found");
		    }
		}*/
	
		    System.out.println("Enter Mail Id : ");
		    String mail = sc.next();

		    System.out.println("Enter the Pwd");
		    String pwd = sc.next();
		    boolean found = false;
		    for (Customer c : list) {
		        if (c.getEmail().equals(mail)) {

		            found = true;

		            if (c.getPassword().equals(pwd)) {

		                System.out.println("Enter New Password:");
		                String newPwd = sc.next();

		                Validation.passwordverifcation(newPwd);
		                c.setPassword(newPwd);

		                System.out.println("Password Updated Successfully");
		            } else {
		                System.out.println("Incorrect Password");
		            }
		            break;
		        }
		    }

		    if (!found) {
		        System.out.println("Email not found");
		    }
		}
	
	public static void SortbyName() {
		
		
		list.stream().sorted((c1,c2)->(c1.getName().compareTo(c2.getName()))).forEach(System.out::println);
		
	}
	
	
		public static void sortByPrice() {

		    list.stream()
		        .sorted((c1, c2) -> Integer.compare(c1.getRegisterationamount(), c2.getRegisterationamount()))
		        .forEach(System.out::println);
		
	}
		
		public static void SortedbyPlan() {
			
			list.stream().sorted((c1,c2)->(c1.getService_plan().compareTo(c2.getService_plan()))).forEach(System.out::println);
		}
		
		
		public static void getRegisterationamount() {
			
		int sum = list.stream().mapToInt(c->c.getRegisterationamount()).sum();
			System.out.println("Sum of total amount Service "+sum);
		}
		

	
		public static void RegisterationamountAccordingToplan() {
			    System.out.println("Enter the Serviceplan Which Sum you want to know ");
			    ServicePlan s = ServicePlan.valueOf(sc.next().toUpperCase());

			    int sum = list.stream()
			            .filter(c -> c.getService_plan() == s) // 🔥 filter by plan
	
			            .mapToInt(c -> c.getRegisterationamount())
			            .sum(); //  sum
			    // Why == is Better for Enum or we can use equals also 

			 // Enum is singleton (one instance only)
			 // So memory reference is same
			    System.out.println("Total Registration Amount for " + s + " = " + sum);
			}
		
		public static void UnsubscribeCust() {
			System.out.println("Enter mail id you want to Remove :");
			String mail=sc.next();
			
			
		
					Customer cust = new Customer(mail);
			int ind = list.indexOf(cust);
			
			if(ind!=-1) {
				list.remove(ind);
				System.out.println("Customer has Deleted ");
			}else {
				System.out.println("Customer was not Present");
			}
		}
}
