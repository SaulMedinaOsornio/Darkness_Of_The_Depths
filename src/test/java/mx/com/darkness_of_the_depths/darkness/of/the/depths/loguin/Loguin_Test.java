package mx.com.darkness_of_the_depths.darkness.of.the.depths.loguin;

import mx.com.darkness_of_the_depths.darkness.of.the.depths.LoguinController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Loguin_Test {
    private LoguinController loguinController = new LoguinController();
    private final boolean expectedFalse = false;
    private final boolean expectedTrue = false;

    //Email Test
    @Test
    public void should_return_false_when_the_email_is_null() {
        String email = null;
        boolean actual = loguinController.isEmailValid(email);
        assertEquals(expectedFalse, actual);
    }

    @Test
    public void should_return_false_when_the_email_is_empty() {
        String email = "";
        boolean actual = loguinController.isEmailValid(email);
        assertEquals(expectedFalse, actual);
    }
    @Test
    public void should_return_false_when_the_email_do_not_have_the_at() {
        String email = "23202045utfv.edi.mx";
        boolean actual = loguinController.isEmailValid(email);
        assertEquals(expectedFalse, actual);
    }

    @Test
    public void should_return_true_when_the_email_is_normal() {
        String email = "23202045@utfv.edi.mx";
        boolean actual = loguinController.isEmailValid(email);
        assertEquals(expectedTrue, actual);
    }

    //Password Test
    @Test
    public void should_return_false_when_the_password_is_null() {
        String password = null;
        boolean actual = loguinController.isPasswordValid(password);
        assertEquals(expectedFalse, actual);
    }

    @Test
    public void should_return_false_when_the_password_length_is_menor_8() {
        String password = "1234567";
        boolean actual = loguinController.isPasswordValid(password);
        assertEquals(expectedFalse, actual);
    }

    @Test
    public void should_return_true_when_the_password_length_is_normal() {
        String password = "12345678";
        boolean actual = loguinController.isPasswordValid(password);
        assertEquals(expectedTrue, actual);
    }
}
