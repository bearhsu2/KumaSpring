package idv.kuma.controller;

import idv.kuma.repository.CourseRepository;
import idv.kuma.vo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
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

        List<Course> courses = courseRepository.findAll();

        model.addAttribute("courses", courses);
        
        return "index";
    }

    @GetMapping("/addcourseform")
    public String showAddCourseForm(Course course) {
        return "add-course-form";
    }

    @PostMapping("/add")
    public String addUser(@Valid Course course, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }

        courseRepository.save(course);
        model.addAttribute("courses", courseRepository.findAll());
        return "index";
    }


}