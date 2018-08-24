package idv.kuma.contribution.controller;

import idv.kuma.common.exception.CheckParamException;
import idv.kuma.contribution.service.ContributionService;
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
    public int contribute(PoolAccumulateRequestObj requestObj) {

        try {
            
            checkParam(requestObj);

            contributionService.contribute(requestObj);

            return 0;

        } catch (Exception e) {
            return 9999;
        }

    }

    private void checkParam(PoolAccumulateRequestObj requestObj) throws CheckParamException {
        if (null == requestObj){
            throw new CheckParamException();
        }
    }
}
