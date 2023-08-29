package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int emailboxCapacity;
	private String alternateEmail;
	
	//Constructor for receiving first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Calling a Method for asking  the department - return the Department
		this.department = getDepartment();
	}
	
	//Asking for Department
	private String getDepartment() {
		System.out.println("Department Codes: "
				+ "\nA09f - Sales"
				+ "\nC35o - Dev"
				+ "\nV45y - Acc"
				+ "\nNA - none"
				+ "\nEnter Your Department Code: ");
		Scanner sc = new Scanner(System.in);
		String deptCode = sc.next();
		switch (deptCode) {
		case "A09f": return "Sales";
		case "C35o": return "Development";
		case "V45y": return "Accounting";
		case "": return "";
		default:
			throw new IllegalArgumentException("Unexcepted Value Enter =>"+deptCode);
		}
	}
	
	//To Generate a random password
	
	//Set a Alternate Email
	
	//Change the Password

}
