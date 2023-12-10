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
     * @desc  Gets the first name of the user
     * @return The first name of the user.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @desc  sets the first name of the user
     * @param firstName first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @desc  Gets the last name of the user
     * @return The last name of the user.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @desc  sets the last name of the user
     * @param lastName  last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @desc  Gets the phone no of the user
     * @return The phone no of the user.
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @desc  sets the phone no of the user
     * @param phoneNo  phone no to set.
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @desc  Gets the emailID of the user
     * @return The emailID of the user.
     */
    public String getEmailId() {
        return email;
    }

    /**
     * @desc  sets the emailID of the user
     * @param email  emailID to set.
     */
    public void setEmailId(String email) {
        this.email = email;
    }

    /**
     * @desc  Gets the password of the user
     * @return The password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @desc  sets the password of the user
     * @param password  emailID to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
