package idv.kuma.service;

import idv.kuma.repository.ContributionRepository;
import idv.kuma.vo.ContributionRequestObj;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@RunWith(SpringRunner.class)
public class ContributionServiceTest {

    @TestConfiguration
    static class TestContextConfiguration {
        @Bean
        public ContributionService contributionService() {
            return new ContributionService();
        }
    }

    @Autowired
    private ContributionService service;

    @MockBean
    ContributionRepository mockRepository;


    @Test
    public void Repository_Put_Ok() throws Exception {

        ContributionRequestObj requestObj = new ContributionRequestObj();

        service.contribute(requestObj);

        verify(mockRepository, times(1)).put(requestObj);


    }
}