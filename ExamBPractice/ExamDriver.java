/**
 * 
 */
package ExamBPractice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author nadiabrandl
 *
 */
public class ExamDriver {

    /**
     * @param args
     */
    public static void main(String[] args) {

	// Array list to store contacts
	ArrayList<Contact> contactList = new ArrayList<Contact>();

	String name;
	String socialSecurityNumber = null;
	String emailAddress = null;
	String repeat;
	int counter = 0;

	// takes user input
	Scanner input = new Scanner(System.in);

	do {
	    // Ask user for information to be added to email list
	    System.out.println("Enter the following information to be added to the email list: ");

	    System.out.print("Name: ");
	    name = input.nextLine();

	    try {

		// ask for ss#
		System.out.print("SSN: ");
		socialSecurityNumber = input.nextLine();

		// validate ss#
		if (validSSN(socialSecurityNumber) == true) {
		    System.out.print("The social security number entered is valid");
		}

	    } catch (SocialSecurityException e) {
		System.out.print(e.getMessage());
	    }
	    try {

		// ask for ss#
		System.out.print("\nEmail: ");
		emailAddress = input.nextLine();

		// validate ss#
		if (validEmail(emailAddress) == true) {
		    System.out.print("The Email Address entered is valid");
		}

	    } catch (EmailException e) {
		System.out.print(e.getMessage());
	    }

	    // add contact to contactList if ss# and email are valid

	    try {
		if (validSSN(socialSecurityNumber) && validEmail(emailAddress)) {
		    System.out.println("\nContact will be added to contact list");
		    contactList.add(new Contact(name, socialSecurityNumber, emailAddress));
		    counter++;
		} else {

		    System.out.println("\nContact will  not be added to contact list");

		}
	    } catch (SocialSecurityException | EmailException e) {
		// TODO Auto-generated catch block
		e.getMessage();
	    }

	    // ask user if they will add another contact
	    System.out.print("\nEnter Y or y to continue adding contacts to the list, anything else to exit.");
	    repeat = input.nextLine();

	} while (repeat.equalsIgnoreCase("Y"));

	for (Contact c : contactList) {
	    System.out.print(c.toString() + "\n");

	}
	System.out.println("\nTotal Contacts: " + counter);
    }

    public static boolean validSSN(String socialSecurityNumber) throws SocialSecurityException {

	int index = 0;

	if (socialSecurityNumber.length() != 11) {
	    throw new SocialSecurityException("The number you entered is invalid.");
	}

	while (index == 11) {
	    if (index == 3 || index == 6) {
		// check to see if the parenthesis are in the first and fifth positions
		if (socialSecurityNumber.charAt(3) != '-' || socialSecurityNumber.charAt(3) != '-') {
		    // if the dash is in the wrong place, throw an exception
		    throw new SocialSecurityException("Dash is in the wrong place.");
		}
	    } else {
		// check to see if any of the other characters are digits
		if (!Character.isDigit(socialSecurityNumber.charAt(index))) {
		    throw new SocialSecurityException("Contains a character that is not a number at index " + index);
		}
	    }
	    // move to next character
	    index++;

	}
	return true;
    }

    public static boolean validEmail(String emailAddress) throws EmailException {

	int index = 0;

	if (emailAddress.length() < 12) {
	    throw new EmailException("Invalid email entry");
	}

	if (!emailAddress.endsWith("@csc251.com")) {
	    throw new EmailException("The Email Address entered is invalid.");

	}

	return true;
    }

}
