package idv.kuma.repository;

import idv.kuma.vo.ContributionRequestObj;
import org.springframework.stereotype.Component;

import java.util.concurrent.BlockingQueue;

@Component
public class ContributionRepository {

    private BlockingQueue<ContributionRequestObj> requestObjs;


    public void put(ContributionRequestObj requestObj){
        // do things...
    }


}
