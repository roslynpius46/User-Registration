import com.bridgelabz.userregistration.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    /**
     * @desc Testcase to check if isValidEmailID function returns true for correct email IDs
     */
    @Test
    void testValidEmails() {
        User u1=new User();
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
        User u1=new User();
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
}
