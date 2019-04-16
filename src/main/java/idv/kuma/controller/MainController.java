package idv.kuma.controller;

import idv.kuma.service.CourseService;
import idv.kuma.vo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    CourseService courseService;


    @Autowired
    public MainController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/")
    public String index(Model model) {

        List<Course> courses = courseService.getCourses();

        model.addAttribute("courses", courses);
        return "index";
    }


}