package idv.kuma.controller;

import idv.kuma.service.ContributionService;
import idv.kuma.vo.PoolAccumulateRequestObj;
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

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class ContributionControllerTest {

    @MockBean
    ContributionService mockService;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void When_Service_OK_Then_Return_0() throws Exception {



        PoolAccumulateRequestObj fakeRequestObj = new PoolAccumulateRequestObj();

        ResponseEntity<Integer> entity = this.restTemplate.postForEntity("/contribute", fakeRequestObj, Integer.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertEquals(0, entity.getBody().intValue());

    }


    @Test
    public void When_Service_Throws_Exception_Then_Return_9999() throws Exception {

        // given
        doThrow(new RuntimeException("")).when(mockService).contribute(any(PoolAccumulateRequestObj.class));

        PoolAccumulateRequestObj fakeRequestObj = new PoolAccumulateRequestObj();

        ResponseEntity<Integer> entity = this.restTemplate.postForEntity("/contribute", fakeRequestObj, Integer.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertEquals(9999, entity.getBody().intValue());

    }

}

