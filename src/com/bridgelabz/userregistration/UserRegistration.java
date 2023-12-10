package com.bridgelabz.userregistration;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) throws UserValidation.InvalidPhoneNumberException, UserValidation.InvalidFirstNameException, UserValidation.InvalidPasswordException, UserValidation.InvalidEmailException, UserValidation.InvalidLastNameException {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a valid first name:");
        String firstName = sc.nextLine();
        System.out.println("Enter a valid last name:");
        String lastName = sc.nextLine();
        System.out.println("Enter a valid email ID:");
        String email = sc.nextLine();
        System.out.println("Enter a valid Phone No.:");
        String phoneNo= sc.nextLine();
        System.out.println("Enter a valid Password.:");
        String password= sc.nextLine();


        User u1=new User(firstName,lastName,email,phoneNo,password);
        UserValidation userValid=new UserValidation();


        // Validate the first name
        if (userValid.isValidFirstName(firstName)) {
            System.out.println("Valid first name: " + firstName);
        }
        else {
            System.out.println("Invalid first name. Please make sure it starts with a capital letter and has a minimum length of 3 characters.");
        }

        // Validate the last name
        if (userValid.isValidLastName(lastName)) {
            System.out.println("Valid last name: " + lastName);
        }
        else {
            System.out.println("Invalid last name. Please make sure it starts with a capital letter and has a minimum length of 3 characters.");
        }

        // Validate the email ID
        if (userValid.isValidEmailID(email)) {
            System.out.println("Valid email: " + email);
        }
        else {
            System.out.println("Invalid email.");
        }

        // Validate the phone number
        if (userValid.isValidPhoneNo(phoneNo)) {
            System.out.println("Valid Phone No.: " + phoneNo);
        }
        else {
            System.out.println("Invalid Phone No.");
        }

        // Validate the password
        if (userValid.isValidPassword(password)) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password. Please make sure it has a minimum of 8 characters, at least 1 uppercase letter, at least 1 numeric digit, and exactly 1 special character.");
        }

        //Check for user entry validity
        if(userValid.validateUser(u1))
            System.out.println("Valid User Entry");
        else
            System.out.println("Invalid User Entry");

        sc.close();
    }


}
