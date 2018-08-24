package idv.kuma.service;


import idv.kuma.repository.ContributionRepository;
import idv.kuma.vo.ContributionRequestObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContributionService {

    @Autowired
    private ContributionRepository queueRepository;

    public void contribute(ContributionRequestObj requestObj) {
        queueRepository.put(requestObj);
    }
}
