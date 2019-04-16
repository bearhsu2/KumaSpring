package idv.kuma.controller;

import idv.kuma.repository.CourseRepository;
import idv.kuma.vo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    CourseRepository courseRepository;


    @Autowired
    public MainController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("/")
    public String index(Model model) {

        List<Course> courses = courseRepository.getCourses();

        model.addAttribute("courses", courses);
        
        return "index";
    }


}