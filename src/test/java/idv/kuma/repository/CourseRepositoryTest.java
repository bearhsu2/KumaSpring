package idv.kuma.repository;

import idv.kuma.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.reflect.Whitebox;

import java.util.ArrayList;
import java.util.List;


@RunWith(org.powermock.modules.junit4.PowerMockRunner.class)
@PrepareForTest({})
@SuppressStaticInitializationFor({"idv.kuma.repository.CourseRepository"})
public class CourseRepositoryTest {

    @Test
    public void When_FindAll_Then_Return_All_Courses() {

        List<Course> existingCourses = new ArrayList<>();
        existingCourses.add(new Course("A", "A", 1D, "A"));
        existingCourses.add(new Course("B", "B", 2D, "B"));

        Whitebox.setInternalState(CourseRepository.class, "courses", existingCourses);

        CourseRepository repository = new CourseRepository();
        List<Course> all = repository.findAll();

        System.out.println();

    }
}