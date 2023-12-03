package com.bridgelabz.userregistration;

public class User {
    private String firstName;

    public User(String firstName)
    {
        this.firstName=firstName;
    }

    /**
     * @desc Checking if first name is valid
     * @param firstName first name input by user
     * @return True if valid else False
     */
    public boolean isValidFirstName(String firstName) {
        // Check if the first name starts with a capital letter and has a minimum length of 3 characters
        return firstName.matches("[A-Z][a-zA-Z]{2,}");
    }
}
