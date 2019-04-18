package idv.kuma.repository;

import idv.kuma.entity.Course;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.reflect.Whitebox;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RunWith(org.powermock.modules.junit4.PowerMockRunner.class)
@PrepareForTest({})
@SuppressStaticInitializationFor({"idv.kuma.repository.CourseRepository"})
public class CourseRepositoryTest {

    private List<Course> expected;

    @Test
    public void When_FindAll_Then_Return_All_Courses() {

        prepareExistingCourses(
                new Course("A", "A", 1D, "A"),
                new Course("B", "B", 2D, "B"));

        CourseRepository repository = new CourseRepository();
        List<Course> actual = repository.findAll();

        Assert.assertEquals(2, actual.size());
        Assert.assertTrue(actual.contains(expected.get(0)));
        Assert.assertTrue(actual.contains(expected.get(1)));
    }


    @Test
    public void When_FindByName_Exists_Then_Return_Course() {

        prepareExistingCourses(
                new Course("A", "A", 1D, "A"),
                new Course("B", "B", 2D, "B"));

        CourseRepository repository = new CourseRepository();
        Optional<Course> actual = repository.findByName("B");

        Assert.assertTrue(actual.isPresent());
        Assert.assertEquals(expected.get(1), actual.get());
    }


    @Test
    public void When_FindByName_NOT_Exists_Then_Return_Nothing() {

        prepareExistingCourses(
                new Course("A", "A", 1D, "A"),
                new Course("B", "B", 2D, "B"));

        CourseRepository repository = new CourseRepository();
        Optional<Course> actual = repository.findByName("C");

        Assert.assertFalse(actual.isPresent());
    }

    private void prepareExistingCourses(Course... courses) {
        expected = new ArrayList<>();
        for (Course course : courses) {
            expected.add(course);
        }
        Whitebox.setInternalState(CourseRepository.class, "courses", expected);

    }


}