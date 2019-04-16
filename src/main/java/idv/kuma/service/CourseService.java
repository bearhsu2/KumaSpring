package idv.kuma.service;

import idv.kuma.vo.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseService {

    public List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", "This is a typical math class", 15D, "N/A"));
        courses.add(new Course("Chinese", "Chinese is important.", 30.5, "Taiwan No. 1!!!"));
        courses.add(new Course("English", "Hello. How are you?", 10D, "I'm fine. Thank you."));
        return courses;
    }
}
