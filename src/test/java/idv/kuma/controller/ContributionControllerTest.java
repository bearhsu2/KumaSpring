package idv.kuma.controller;

import idv.kuma.vo.PoolAccumulateRequestObj;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class ContributionControllerTest {


    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test_ALL_OK() throws Exception {

        PoolAccumulateRequestObj requestObj = new PoolAccumulateRequestObj();

        ResponseEntity<Integer> entity = this.restTemplate.postForEntity("/contribute",requestObj, Integer.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertEquals(0, entity.getBody().intValue());

    }

}

