package com.bridgelabz.userregistration;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a valid first name:");
        String firstName = sc.nextLine();

        User u1=new User(firstName);

        // Validate the first name
        if (u1.isValidFirstName(firstName)) {
            System.out.println("Valid first name: " + firstName);
        } else {
            System.out.println("Invalid first name. Please make sure it starts with a capital letter and has a minimum length of 3 characters.");
        }

        sc.close();
    }


}
