package idv.kuma.contribution.controller;

import idv.kuma.contribution.vo.PoolAccumulateRequestObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContributionController {

    @RequestMapping(value = "/contribute", method = RequestMethod.POST)
    public String contribute(PoolAccumulateRequestObj requestObj) {


        return "success " + requestObj.getMNum() + " AAA";
    }
}
