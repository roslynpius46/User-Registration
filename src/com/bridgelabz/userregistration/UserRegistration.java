package com.bridgelabz.userregistration;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args)
    {
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

        // Validate the first name
        if (u1.isValidFirstName()) {
            System.out.println("Valid first name: " + firstName);
        }
        else {
            System.out.println("Invalid first name. Please make sure it starts with a capital letter and has a minimum length of 3 characters.");
        }

        // Validate the last name
        if (u1.isValidLastName()) {
            System.out.println("Valid last name: " + lastName);
        }
        else {
            System.out.println("Invalid last name. Please make sure it starts with a capital letter and has a minimum length of 3 characters.");
        }

        // Validate the email ID
        if (u1.isValidEmailID()) {
            System.out.println("Valid email: " + email);
        }
        else {
            System.out.println("Invalid email.");
        }

        // Validate the phone number
        if (u1.isValidPhoneNo()) {
            System.out.println("Valid Phone No.: " + phoneNo);
        }
        else {
            System.out.println("Invalid Phone No.");
        }

        // Validate the password
        if (u1.isValidPassword()) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }



        sc.close();
    }


}
