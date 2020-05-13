package yonas;

import java.util.Scanner;

public class Email {
	// properties of email
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int passwordLength = 10;
	private String alternateEmail;
	private String companySuffix = "yonas.com";

	// constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		// this keyword to refer class level variable
		this.firstName = firstName;
		this.lastName = lastName;

		// Call a method asking the department and return the department
		// Assigning the value that we get from the user to our class level department
		// property
		this.department = setDepartment();

		// Call a method that returns/generates a random password
		this.password = randomPassword(passwordLength);
		System.out.println("Your password is : "+ password );

		// generate email
		if (department == "sales" || department == "development" || department == "accounting") {
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		} else {
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companySuffix;
		}


	}

	// Ask for the department info
	private String setDepartment() {
		System.out.print("Hi "+firstName+"."+
				" department codes : \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		//Using the Java scanner class to get input from user. 
		Scanner in = new Scanner(System.in);
		int dep = in.nextInt();
		in.close();
		if (dep == 1) {
			return "sales";
		} else if (dep == 2) {
			return "development";
		} else if (dep == 3) {
			return "accounting";
		} else {
			return "";
		}

	}

	// Generate a random password
	private String randomPassword(int length) {
		// password characters
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		// Array of char to store every single character in the above string variable
		char[] password = new char[length];
		// iterate thru the characters
		for (int i = 0; i < length; i++) {
			// need to parse it to int because random() returns double
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		// Return password as String
		return new String(password);

	}

	// Set the mailbox capacity of the email account
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// change the password
	public void changePassword(String password) {
		this.password = password;
	}

	// Implementing the getters
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}
	//Displaying the user information
	public String showInfo() {
		return "Name : "+firstName+" "+lastName+
				"\nCompany Email : "+email+
				"\nMail box capacity : "+mailBoxCapacity+" mb";
	}

}
