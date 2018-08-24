package idv.kuma.contribution.service;


import idv.kuma.contribution.vo.PoolAccumulateRequestObj;
import org.springframework.stereotype.Component;

@Component
public class ContributionService {

    public int contribute(PoolAccumulateRequestObj requestObj){
        // do process...
        return this.hashCode();
    }
}
