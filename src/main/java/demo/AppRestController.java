package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    @RequestMapping("/")
    public String helloWorld() {
        return "Is it finally good?";
    }
}
