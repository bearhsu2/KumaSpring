package idv.kuma.controller;

import idv.kuma.repository.ContributionRepository;
import idv.kuma.vo.ContributionRequestObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContributionController {


    private ContributionRepository contributionRepository;

    @Autowired
    public ContributionController(ContributionRepository contributionRepository) {
        this.contributionRepository = contributionRepository;
    }

    @PostMapping(value = "/contribute")
    public int contribute(ContributionRequestObj requestObj) {

        try {

            contributionRepository.put(requestObj);

            return 0;
        } catch (Exception e) {
            return 9999;
        }

    }


}
