package com.newbatches;

import java.util.Scanner;

public class LoyalaCollege {

	public static void main(String[] args) {
		
	
	Scanner lc = new Scanner(System.in);
	
	System.out.println("Enter Student id");
	int id = lc.nextInt();
	System.out.println("Student id: " + id);
	
	lc.nextLine();
	System.out.println("Enter Student Name");
	String name = lc.nextLine();
	System.out.println("Student Name: " + name);
	
	System.out.println("Enter Student Email");
	String mail = lc.next();
	System.out.println("Student Email id: " + mail);
	
	System.out.println("Enter Student Phone no");
	long phone = lc.nextLong();
	System.out.println("Student Phone no: "+ phone);
	
    System.out.println("Enter Student Dept");
    String dept = lc.next();
    System.out.println("Student Dept: "+ dept);
    
    System.out.println("Enter Student Gender");
    String gender = lc.next();
    System.out.println("Student Gender: "+ gender);
    
    System.out.println("Enter Student City");
    String city = lc.next();
    System.out.println("Student City: "+ city);
    
    
	}
}
