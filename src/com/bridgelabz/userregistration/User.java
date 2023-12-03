package com.bridgelabz.userregistration;

/**
 * @desc Class that represents a user
 */
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private String password;

    /**
     * @desc Constructor that initializes user details
     * @param firstName First name of user
     * @param lastName last name of user
     * @param email Email ID of user
     * @param phoneNo Phone No. of user
     * @param password user password
     *
     */
    public User(String firstName,String lastName,String email,String phoneNo, String password )
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.phoneNo=phoneNo;
        this.password=password;

    }

    /**
     * @desc Checking if first is valid
     * @return True if valid else False
     */
    public boolean isValidFirstName() {
        // Check if name starts with a capital letter and has a minimum length of 3 characters
        return firstName.matches("[A-Z][a-zA-Z]{2,}");
    }

    /**
     * @desc Checking if last name is valid
     * @return True if valid else False
     */
    public boolean isValidLastName() {
        // Check if name starts with a capital letter and has a minimum length of 3 characters
        return lastName.matches("[A-Z][a-zA-Z]{2,}");
    }

    /**
     * @desc Checking if email ID is valid
     * @return True if valid else False
     */
    public boolean isValidEmailID() {
        // Check if the email follows the specified format
        return email.matches("[a-zA-Z]+\\.[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+(\\.[a-zA-Z]+)?");
    }

    /**
     * @desc Checking if phone number is valid
     * @return True if valid else False
     */
    public boolean isValidPhoneNo() {
        // Check if the email follows the specified format
        return phoneNo.matches("91 \\d{10}");
    }

    /**
     * @desc Checking if password is valid
     * @return True if valid else False
     */
    public boolean isValidPassword() {
        // Rule 1: min 8 characters
        return password.length() >= 8 && containsUppercaseLetter(password) && containsNumericDigit(password) && hasExactlyOneSpecialCharacter(password);
    }

    /**
     * @desc Function to check if the password contains at least 1 uppercase letter
     * @param password Input by user
     * @return True if password has at least one uppercase letter else False
     */
    private static boolean containsUppercaseLetter(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @desc Function to check if the password contains at least 1 numeric digit
     * @param password Input by user
     * @return True if password has at least one number else False
     */
    private static boolean containsNumericDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @desc Function to check if the password contains a special character
     * @param password Input by user
     * @return True if password has one special character else False
     */
    private static boolean hasExactlyOneSpecialCharacter(String password) {
        int specialCharacterCount = 0;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                specialCharacterCount++;
            }
        }
        return specialCharacterCount == 1;
    }
}
