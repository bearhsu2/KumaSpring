package idv.kuma.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import idv.kuma.service.QueryService;
import idv.kuma.vo.QueryReturnObj;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class QueryControllerTest {

    @MockBean
    private QueryService mockedQueryService;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testQueryOK() throws Exception {

        QueryReturnObj fakeReturnObj = new QueryReturnObj();
        prepareService(fakeReturnObj);

        runAndCheck("/query/12345", fakeReturnObj);

    }

    private void prepareService(QueryReturnObj fakeResult) {
        when(mockedQueryService.query(anyString())).thenReturn(fakeResult);
    }

    private void runAndCheck(String path, QueryReturnObj expectedResult) {
        ResponseEntity<String> entity = this.restTemplate.getForEntity(path, String.class);
        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);

        assertEquals(new GsonBuilder().serializeNulls().create().toJson(expectedResult), entity.getBody());

    }

}