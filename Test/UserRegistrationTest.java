import com.bridgelabz.userregistration.User;
import com.bridgelabz.userregistration.UserValidation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    /**
     * @desc Testcase to check if isValidEmailID function returns true for correct email IDs
     */
    @Test
    void testValidEmails() {
        UserValidation u1=new UserValidation();
        assertTrue(u1.isValidEmailID("abc@yahoo.com"));
        assertTrue(u1.isValidEmailID("abc-100@yahoo.com"));
        assertTrue(u1.isValidEmailID("abc.100@yahoo.com"));
        assertTrue(u1.isValidEmailID("abc111@abc.com"));
        assertTrue(u1.isValidEmailID("abc-100@abc.net"));
        assertTrue(u1.isValidEmailID("abc.100@abc.com.au"));
        assertTrue(u1.isValidEmailID("abc@1.com"));
        assertTrue(u1.isValidEmailID("abc@gmail.com.com"));
        assertTrue(u1.isValidEmailID("abc+100@gmail.com"));
    }

    /**
     * @desc Testcase to check if isValidEmailID function returns false for incorrect email IDs
     */
    @Test
    void testInvalidEmailsTLD() {
        UserValidation u1=new UserValidation();
        assertFalse(u1.isValidEmailID("abc"));
        assertFalse(u1.isValidEmailID("abc@.com.my"));
        assertFalse(u1.isValidEmailID("abc123@gmail.a"));
        assertFalse(u1.isValidEmailID("abc123@.com"));
        assertFalse(u1.isValidEmailID("abc123@.com.com"));
        assertFalse(u1.isValidEmailID(".abc@abc.com"));
        assertFalse(u1.isValidEmailID("abc()*@gmail.com"));
        assertFalse(u1.isValidEmailID("abc@%*.com"));
        assertFalse(u1.isValidEmailID("abc..2002@gmail.com"));
        assertFalse(u1.isValidEmailID("abc.@gmail.com"));
        assertFalse(u1.isValidEmailID("abc@abc@gmail.com"));
        assertFalse(u1.isValidEmailID("abc@gmail.com.1a"));
        assertFalse(u1.isValidEmailID("abc@gmail.com.aa.au"));
    }

    /**
     *
     * @desc : Test case to verify valid user where all entries are valid
     */
    @Test
    public void happyTestAllValid(){
        UserValidation userValidate=new UserValidation();
        User user = new User("Riya" , "Anil" ,"riya.anil@gmail.com" ,  "91 9988776655" , "Password*1234");
        assertTrue(userValidate.validateUser(user));
    }

    /**
     *
     * @desc : Test case to verify invalid user where first name is invalid
     */
    @Test
    public void sadTestFirstNameInvalid(){
        UserValidation userValidate=new UserValidation();
        User user = new User("riya" , "Anil" ,"riya.anil@gmail.com" ,  "91 9988776655" , "Password*1234");
        assertFalse(userValidate.validateUser(user));
    }

    /**
     *
     * @desc : Test case to verify invalid user where last name is invalid
     */
    @Test
    public void sadTestLastNameInvalid(){
        UserValidation userValidate=new UserValidation();

        User user = new User("Riya" , "A" ,"riya.anil@gmail.com" ,  "91 9988776655" , "Password*1234");
        assertFalse(userValidate.validateUser(user));
    }

    /**
     *
     * @desc : Test case to verify invalid user where emailID is invalid
     */
    @Test
    public void sadTestEmailInvalid(){
        UserValidation userValidate=new UserValidation();

        User user = new User("Riya" , "Anil" ,"riya.anil.com" ,  "91 9988776655" , "Password*1234");
        assertFalse(userValidate.validateUser(user));
    }

    /**
     *
     * @desc : Test case to verify invalid user where Phone Number is invalid
     */
    @Test
    public void sadTestPhoneNumberInvalid(){
        UserValidation userValidate=new UserValidation();

        User user = new User("Riya" , "Anil" ,"riya.anil@gmail.com" ,  "9988776655" , "Password*1234");
        assertFalse(userValidate.validateUser(user));
    }

    /**
     *
     * @desc : Test case to verify invalid user where password is invalid
     */
    @Test
    public void sadTestPasswordInvalid(){
        UserValidation userValidate=new UserValidation();

        User user = new User("Riya" , "Anil" ,"riya.anil@gmail.com" ,  "91 9988776655" , "password**");
        assertFalse(userValidate.validateUser(user));
    }
}
