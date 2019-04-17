package idv.kuma.repository;

import idv.kuma.vo.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseRepository {

    private static List<Course> courses = new ArrayList<>();

    static {
        courses.add(new Course("Math", "This is a typical math class", 15D, "N/A"));
        courses.add(new Course("Chinese", "Chinese is important.", 30.5, "Taiwan No. 1!!!"));
        courses.add(new Course("English", "Hello. How are you?", 10D, "I'm fine. Thank you."));
    }

    public List<Course> findAll() {
        return courses;
    }

    public void save(Course course) {
        courses.add(course);
    }
}
