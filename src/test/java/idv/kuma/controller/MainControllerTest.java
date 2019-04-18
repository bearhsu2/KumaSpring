package idv.kuma.controller;

import idv.kuma.entity.Course;
import idv.kuma.repository.CourseRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CourseRepository mockedCourseRepository;

    @Test
    public void When_Call_Root_Then_Return_Index() throws Exception {


        List<Course> courses = Arrays.asList(new Course("Chinese", "FakeChineseDescription", 100D, "FakeChineseComments"),
                new Course("Math", "FakeMathDescription", 100D, "FakeMathComments"));

        when(mockedCourseRepository.findAll()).thenReturn(courses);

        ResultActions resultActions = mvc.perform(MockMvcRequestBuilders.get("/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(action -> {
                    List<Course> actualCourses = (List<Course>) action.getModelAndView().getModel().get("courses");
                    Assert.assertEquals(2, actualCourses.size());
                    Assert.assertTrue(actualCourses.contains(courses.get(0)));
                    Assert.assertTrue(actualCourses.contains(courses.get(1)));
                });
    }
}