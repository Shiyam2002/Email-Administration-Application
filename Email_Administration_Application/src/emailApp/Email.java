package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private String company = "company.com";
	private int emailboxCapacity;
	private String alternateEmail;
	
	//Constructor for receiving first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Calling a Method for asking  the department - return the Department
		this.department = getDepartment();
		
		//calling the randomPassword method to generate password
		this.password = randomPassword(8);
		
		//Creating a Email
		email = firstName + "." + lastName + "@" + department + "." + company;
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
	private String randomPassword(int lenght) {
		String lowerCaseLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String capitalCaseLetter = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = lowerCaseLetter + capitalCaseLetter 
								+ specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[lenght];
		
		password[0] = lowerCaseLetter.charAt(random.nextInt(lowerCaseLetter.length()));
		password[1] = numbers.charAt(random.nextInt(numbers.length()));
		password[2] = capitalCaseLetter.charAt(random.nextInt(capitalCaseLetter.length()));
		password[3] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		
		for(int i=4;i<lenght;i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		
		return new String(password);
	}
	
	//Set a Mail Box Capacity
	public void setMailBoxCapacity(int capacity) {
		this.emailboxCapacity = capacity
	}
	
	//Set a Alternate Email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the Password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//getting the Alternate email and password
	public String getAlternateEmail() {return alternateEmail;}
	public int getMailBoxCapacity() {return emailboxCapacity;}

}
