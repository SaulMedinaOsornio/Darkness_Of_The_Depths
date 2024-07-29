package mx.com.darkness_of_the_depths.controller;

import mx.com.darkness_of_the_depths.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/loguin")
public class LoguinController {

    @Autowired
    UserRepository userRepository;

    public String serverMessageStatus(String email, String password){
        if (areCorrect(email,password)){
            return "200";
        }else {
            return "400";
        }
    }

    public boolean areCorrect(String email, String password) {
        return isEmailValid(email) && isPasswordValid(password);
    }

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
