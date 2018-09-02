package idv.kuma.repository;

import idv.kuma.vo.ContributionRequestObj;
import org.springframework.stereotype.Component;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Component
public class ContributionRepository {

    private BlockingQueue<ContributionRequestObj> requestObjs = new LinkedBlockingQueue<>();

    public void put(ContributionRequestObj requestObj) throws InterruptedException {
        requestObjs.put(requestObj);
    }


}
