package com.bridgelabz.userregistration;

public class UserValidation {

    /**
     * @desc Checking if first is valid
     * @param firstName firstName input by user
     * @return True if valid else False
     */
    public boolean isValidFirstName(String firstName) {
        // Check if name starts with a capital letter and has a minimum length of 3 characters
        return firstName.matches("[A-Z][a-zA-Z]{2,}");
    }

    /**
     * @desc Checking if last name is valid
     * @param lastName lastName input by user
     * @return True if valid else False
     */
    public boolean isValidLastName(String lastName) {
        // Check if name starts with a capital letter and has a minimum length of 3 characters
        return lastName.matches("[A-Z][a-zA-Z]{2,}");
    }

    /**
     * @desc Checking if email ID is valid
     * @param email email input by user
     * @return True if valid else False
     */
    public boolean isValidEmailID(String email) {
        // Check if the email follows the specified format
        return email.matches("^[A-Za-z0-9]+[A-Za-z0-9-+]*([.][A-Za-z0-9-]+)*@[A-Za-z0-9-]+([.][a-zA-Z][a-zA-Z]+)([.][a-zA-Z][a-zA-Z]+)?$");
    }

    /**
     * @desc Checking if phone number is valid
     * @param phoneNo phone number input by user
     * @return True if valid else False
     */
    public boolean isValidPhoneNo(String phoneNo) {
        // Check if the email follows the specified format
        return phoneNo.matches("91 \\d{10}");
    }

    /**
     * @desc Checking if password is valid
     * @param password password input by user
     * @return True if valid else False
     */
    public boolean isValidPassword(String password) {
        // Rule 1: min 8 characters
        return password.length() >= 8 && containsUppercaseLetter(password) && containsNumericDigit(password) && hasExactlyOneSpecialCharacter(password);
    }

    /**
     * @desc Function to check if the password contains at least 1 uppercase letter
     * @param password Input by user
     * @return True if password has at least one uppercase letter else False
     */
    private boolean containsUppercaseLetter(String password) {
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
    private boolean containsNumericDigit(String password) {
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
    private boolean hasExactlyOneSpecialCharacter(String password) {
        int specialCharacterCount = 0;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                specialCharacterCount++;
            }
        }
        return specialCharacterCount == 1;
    }

    public boolean validateUser(User user)
    {

        return isValidFirstName(user.getFirstName())&&
                isValidLastName(user.getLastName())&&
                isValidEmailID(user.getEmailId())&&
                isValidPhoneNo(user.getPhoneNo())&&isValidPassword(user.getPassword());
    }
}
