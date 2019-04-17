package idv.kuma.controller;

import idv.kuma.repository.CourseRepository;
import idv.kuma.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
            return "add-course-form";
        }

        courseRepository.save(course);
        model.addAttribute("courses", courseRepository.findAll());
        return "index";
    }


    @GetMapping("/edit/{name}")
    public String showUpdateForm(@PathVariable("name") String name, Model model) {
        Course course = courseRepository.findByName(name).orElseThrow(() -> new IllegalArgumentException("Invalid course name:" + name));
        model.addAttribute("course", course);
        return "update-course-form";
    }


    @PostMapping("/update/{name}")
    public String updateUser(@PathVariable("name") String name, @Valid Course course, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "update-user";
        }

        courseRepository.save(course);
        model.addAttribute("courses", courseRepository.findAll());
        return "index";
    }

    @GetMapping("/delete/{name}")
    public String deleteUser(@PathVariable("name") String name, Model model) {
        Course course = courseRepository.findByName(name).orElseThrow(() -> new IllegalArgumentException("Invalid course name:" + name));

        courseRepository.delete(course);
        model.addAttribute("courses", courseRepository.findAll());
        return "index";
    }


}