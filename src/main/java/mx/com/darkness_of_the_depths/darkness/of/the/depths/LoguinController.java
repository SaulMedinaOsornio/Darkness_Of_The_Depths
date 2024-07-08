package mx.com.darkness_of_the_depths.darkness.of.the.depths;

public class LoguinController {

    public boolean isEmailValid(String email) {
        boolean isValid = false;
        if (email != null) {
            if (!email.isEmpty()) {
                if (email.contains("@")) {
                    isValid = true;
                }
            }
        }
        return isValid;
    }

    public boolean isPasswordValid(String password) {
        boolean isValid = false;
        if (password != null) {
            if (password.length() >= 8) isValid = true;
        }
        return isValid;
    }
}
