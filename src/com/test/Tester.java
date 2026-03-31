package com.test;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.Utility.Utility;
import com.code.Customer;
import com.code.ServicePlan;
import com.customvalidation.CustomeValidation;
import com.service.Service;

public class Tester {

	
	public static void main(String[] args) {
		Service service=new Service();
		
		int choice ;
		char wish;
		Scanner sc=new Scanner(System.in);
		do {
		try {
			System.out.println("------------Menu");
			System.out.println("1.Show All");
			System.out.println("2.Add");
			System.out.println("3.Login ");
			System.out.println("4.Update Password ");
			System.out.println("5.Sort By Name ");
			System.out.println("6.Sort By Price ");
			System.out.println("7.Sort By Service Plan ");
			System.out.println("8.getRegisterationamount");
			System.out.println("9.RegisterationamountAccordingToplan");
			System.out.println("10.Unsubscribe customer");
			System.out.println("11.Exit");
			System.out.println("Enter your Chocie ");
			choice=sc.nextInt();
			switch (choice) {
			case 1: 
				Service.show();
				break;
				
			case 2:
			System.out.println("Enter Name Email,Service[GOLD,SILVER,PLATINUM,DIAMOND],Date,Password,Registration Amount");
			Service.add(sc.next(), sc.next(),ServicePlan.valueOf(sc.next().toUpperCase()),LocalDate.parse(sc.next()), sc.next(),sc.nextInt());
			break;
			
			case 3:
				Service.Login();
				break;
				
			case 4:
				Service.UpdateMail();
				break;
				
			case 5:
				Service.SortbyName();
				break;
				
				
			case 6:
				
				Service.sortByPrice();
				break;
				
			case 7:
			Service.SortedbyPlan();
			break;
			case 8:
				Service.getRegisterationamount();
				break;
				
			case 9:
				Service.RegisterationamountAccordingToplan();
				break;
			case 10:
				Service.UnsubscribeCust();
				break;
				
			case 11:
				System.out.println("Exit Program ");
				sc.close();
				return;
			default:
				
				System.out.println("Brooo you need to check your eye pls enter correct choice ");
			
			}
			
		}catch(Exception e){
			System.err.println(e);
			sc.nextLine();
		}System.out.println("\nDo You Want To Continue (y/n) :");
		wish=sc.next().charAt(0);
			
		}while(wish=='y'||wish=='Y');
		
		
		 
	}
}
