package idv.kuma.repository;

import idv.kuma.vo.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Component
public class CourseRepository {

    private static List<Course> courses = new ArrayList<>();

    static {
        courses.add(new Course("Math", "This is a typical math class", 15D, "N/A"));
        courses.add(new Course("Chinese", "Chinese is important.", 30.5, "Taiwan No. 1!!!"));
        courses.add(new Course("English", "Hello. How are you?", 10D, "I'm fine. Thank you."));

        courses.sort(Comparator.comparing(Course::getName));
    }

    public List<Course> findAll() {
        return courses;
    }

    public void save(Course course) {

        findByName(course.getName()).ifPresent(value -> courses.remove(value));
        courses.add(course);
        courses.sort(Comparator.comparing(Course::getName));

    }

    public Optional<Course> findByName(String name) {
        return courses.stream().filter(course -> course.getName().equalsIgnoreCase(name)).findAny();
    }

    public void delete(Course course) {

        List<Course> newCourses = CourseRepository.courses.stream()
                .filter(o -> !o.getName().equalsIgnoreCase(course.getName()))
                .collect(toList());

        CourseRepository.courses = newCourses;

        courses.sort(Comparator.comparing(Course::getName));

    }
}
