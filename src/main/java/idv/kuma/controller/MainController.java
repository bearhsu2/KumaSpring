package idv.kuma.controller;

import idv.kuma.vo.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model) {

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", "This is a typical math class", 15D, "N/A"));
        courses.add(new Course("Chinese", "Chinese is important.", 30.5, "Taiwan No. 1!!!"));
        courses.add(new Course("English", "Hello. How are you?", 10D, "I'm fine. Thank you."));

        model.addAttribute("courses", courses);
        return "index";
    }
}