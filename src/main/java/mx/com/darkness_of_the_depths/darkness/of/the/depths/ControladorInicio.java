package mx.com.darkness_of_the_depths.darkness.of.the.depths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

}
