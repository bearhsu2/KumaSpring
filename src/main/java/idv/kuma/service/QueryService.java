package idv.kuma.service;

import idv.kuma.vo.HitInfoObj;
import idv.kuma.vo.PoolValuesObj;
import idv.kuma.vo.QueryReturnObj;
import org.springframework.stereotype.Component;

@Component
public class QueryService {

    public QueryReturnObj query(String gsId) {


        return QueryReturnObj.
                builder().
                hitInfo(processHitInfo()).
                poolValues(processPoolValue()).
                build();
    }

    private HitInfoObj processHitInfo() {
        return new HitInfoObj();
    }

    private PoolValuesObj processPoolValue() {
        return new PoolValuesObj();
    }


}
