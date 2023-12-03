package com.bridgelabz.userregistration;

/**
 * @desc Class that represents a user
 */
public class User {
    private String firstName;
    private String lastName;
    private String email;

    /**
     * @desc Constructor that initializes user details
     * @param firstName First name of user
     * @param lastName last name of user
     * @param email Email ID of user
     */
    public User(String firstName,String lastName,String email)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    /**
     * @desc Checking if first or last name is valid
     * @param name first or last name input by user
     * @return True if valid else False
     */
    public boolean isValidName(String name) {
        // Check if name starts with a capital letter and has a minimum length of 3 characters
        return name.matches("[A-Z][a-zA-Z]{2,}");
    }

    /**
     * @desc Checking if email ID is valid
     * @param email email ID input by user
     * @return True if valid else False
     */
    public boolean isValidEmailID(String email) {
        // Check if the email follows the specified format
        return email.matches("[a-zA-Z]+\\.[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+(\\.[a-zA-Z]+)?");
    }
}
