package mx.com.darkness_of_the_depths.darkness_of_the_depths.loguin;

import mx.com.darkness_of_the_depths.controller.LoguinController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Login_Test {
    private LoguinController loginController = new LoguinController();
    private final boolean expectedFalse = false;
    private final boolean expectedTrue = false;

    //Email Test
    @Test
    public void should_return_false_when_the_email_is_null() {
        String email = null;
        boolean actual = loginController.isEmailValid(email);
        assertEquals(expectedFalse, actual);
    }

    @Test
    public void should_return_false_when_the_email_is_empty() {
        String email = "";
        boolean actual = loginController.isEmailValid(email);
        assertEquals(expectedFalse, actual);
    }

    @Test
    public void should_return_false_when_the_email_do_not_have_the_at() {
        String email = "23202045utfv.edi.mx";
        boolean actual = loginController.isEmailValid(email);
        assertEquals(expectedFalse, actual);
    }

    @Test
    public void should_return_true_when_the_email_is_normal() {
        String email = "23202045@utfv.edi.mx";
        boolean actual = loginController.isEmailValid(email);
        assertEquals(expectedTrue, actual);
    }

    //Password Test
    @Test
    public void should_return_false_when_the_password_is_null() {
        String password = null;
        boolean actual = loginController.isPasswordValid(password);
        assertEquals(expectedFalse, actual);
    }

    @Test
    public void should_return_false_when_the_password_length_is_menor_8() {
        String password = "1234567";
        boolean actual = loginController.isPasswordValid(password);
        assertEquals(expectedFalse, actual);
    }

    @Test
    public void should_return_true_when_the_password_length_is_normal() {
        String password = "12345678";
        boolean actual = loginController.isPasswordValid(password);
        assertEquals(expectedTrue, actual);
    }

    //Validation return
    @Test
    void should_return_false_when_the_email_is_incorrect() {
        String email = "carlos";
        String password = "123467890";
        boolean actual = loginController.areCorrect(email, password);
        assertEquals(expectedFalse, actual);
    }

    //Code status
    @Test
    void should_return_the_status_code_400_when_all_the_validations_are_false(){
        String email = "carlos";
        String password = "7890";
        String actual = loginController.serverMessageStatus(email , password);
        assertEquals("400", actual);
    }
}
