package idv.kuma.controller;

import idv.kuma.service.ContributionService;
import idv.kuma.vo.PoolAccumulateRequestObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContributionController {

    @Autowired
    ContributionService contributionService;


    @RequestMapping(value = "/contribute", method = RequestMethod.POST)
    public int contribute(PoolAccumulateRequestObj requestObj) {

        try {


            contributionService.contribute(requestObj);

            return 0;

        } catch (Exception e) {
            return 9999;
        }

    }


}
