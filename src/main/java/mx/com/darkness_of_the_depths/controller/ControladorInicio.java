package mx.com.darkness_of_the_depths.controller;

import mx.com.darkness_of_the_depths.controller.models.Adress;
import mx.com.darkness_of_the_depths.controller.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RestController
@Controller
public class ControladorInicio {

    @GetMapping("/index")
    public String inicio() {
        return "index";
    }

    @GetMapping("/loguin")
    public String loguin() {
        return "loguin";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }


    @GetMapping("/test")
    public String testingData(Model model) {

        User user = new User();
        user.setName("Carlos");
        user.setEmail("Carlos@gmail.com");
        user.setPassword("1281515");
        user.setCellPhone("223355772288");
        user.setShippingId(10);

        User user2 = new User();
        user.setName("Isma");
        user.setEmail("Isma@gmail.com");
        user.setPassword("jdueiviv3");
        user.setCellPhone("3857463955");
        user.setShippingId(1);

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);

        model.addAttribute("users", users);
        model.addAttribute("user", user);

        return "data";
    }

    @RequestMapping(value = "/user/{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("carlos");
        user.setCellPhone("1233432");
        user.setEmail("carlos@gmail.com");
        user.setPassword("hbu$ehr7hd#%");
        user.setShippingId(Integer.parseInt(String.valueOf(id)));
        user.setAdress(new Adress("Carlos XVI"));
        return user;
    }
}
