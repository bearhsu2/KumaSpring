package idv.kuma.controller;

import idv.kuma.repository.ContributionRepository;
import idv.kuma.vo.ContributionRequestObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContributionController {

    @Autowired
    ContributionRepository contributionRepository;

    @RequestMapping(value = "/contribute", method = RequestMethod.POST)
    public int contribute(ContributionRequestObj requestObj) {

        try {

            contributionRepository.put(requestObj);

            return 0;

        } catch (Exception e) {
            return 9999;
        }

    }


}
