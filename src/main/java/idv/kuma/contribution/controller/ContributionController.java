package idv.kuma.contribution.controller;

import idv.kuma.contribution.service.ContributionService;
import idv.kuma.contribution.vo.FakeReturnObj;
import idv.kuma.contribution.vo.PoolAccumulateRequestObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContributionController {

    @Autowired
    ContributionService contributionService;


    @RequestMapping(value = "/contribute", method = RequestMethod.POST)
    public FakeReturnObj contribute(PoolAccumulateRequestObj requestObj) {

        int instance = contributionService.contribute(requestObj);


        return new FakeReturnObj(6666, "success " + requestObj.getMNum() + ". Service =  " + instance);
    }
}
