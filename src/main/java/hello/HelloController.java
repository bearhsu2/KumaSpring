package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bearhsu2 on 3/26/2017.
 */

@RestController
public class HelloController {
    //@RestController combines @Controller and @ResponseBody

    @RequestMapping("/")
    public String index() {

        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/abc")
    public String indexABC() {

        return "Greetings from Spring Boot!ABC";
    }

}
