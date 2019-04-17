package idv.kuma.repository;

import idv.kuma.vo.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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
        List<Course> newCourses = CourseRepository.courses.stream()
                .map(o -> o.getName().equalsIgnoreCase(course.getName()) ? course : o)
                .collect(toList());

        CourseRepository.courses = newCourses;
    }

    public Optional<Course> findByName(String name) {
        return courses.stream().filter(course -> course.getName().equalsIgnoreCase(name)).findAny();
    }
}
