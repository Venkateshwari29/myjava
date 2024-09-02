package com.newbatches;
import java.util.Scanner;


public class NewCandidates {
	
	public static void main(String[] args) {
		Scanner az = new Scanner (System.in);
		
		System.out.println("Enter employee id");
		
		int i = az.nextInt();
		System.out.println("Employee id is " + i);
		
		az.nextLine();
		
		System.out.println("Enter Employee Name: ");
		String name = az.nextLine();
		System.out.println("Employee Name is " + name);
		
		System.out.println("Enter Employee email id");
		String mail = az.next();
		System.out.println("Employee email id: " + mail );
		
		System.out.println("Enter Employee Phone Number");
		Long ph = az.nextLong();
		System.out.println("Employee Phone Number: "+ ph);
		
		System.out.println("Enter Employee Salary");
		Float salary  = az.nextFloat();
		System.out.println("Employee Salary: " + salary);
		
		System.out.println("Enter Employee Gender");
		String Gender = az.next();
		System.out.println("Employee Gender: "+ Gender);
		
		System.out.println("Enter Employee City");
		String city = az.next();
		System.out.println("Employee City: " + city);
	}
}
