package idv.kuma.query.controller;

import idv.kuma.service.QueryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class QueryControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private QueryService mockedQueryService;

    @Test
    public void testQueryOK() throws Exception {

        prepareService("fakeResult");

        runAndCheck("/query/12345", "fakeResult");

    }

    private void prepareService(String fakeResult) {
        when(mockedQueryService.query(anyString())).thenReturn(fakeResult);
    }

    private void runAndCheck(String path, String expectedResult) {
        ResponseEntity<String> entity = this.restTemplate.getForEntity(path, String.class);
        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertEquals(expectedResult, entity.getBody());
    }

}