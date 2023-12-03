package com.bridgelabz.userregistration;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a valid first name:");
        String firstName = sc.nextLine();

        // Validate the first name
        if (isValidFirstName(firstName)) {
            System.out.println("Valid first name: " + firstName);
        } else {
            System.out.println("Invalid first name. Please make sure it starts with a capital letter and has a minimum length of 3 characters.");
        }

        sc.close();
    }

    /**
     * @desc Checking if first name is valid
     * @param firstName first name input by user
     * @return True if valid else False
     */
    private static boolean isValidFirstName(String firstName) {
        // Check if the first name starts with a capital letter and has a minimum length of 3 characters
        return firstName.matches("[A-Z][a-zA-Z]{2,}");
    }
}
