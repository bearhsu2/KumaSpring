package idv.kuma.service;

import idv.kuma.vo.QueryReturnObj;
import org.springframework.stereotype.Component;

@Component
public class QueryService {

    public QueryReturnObj query(String gsId){

//        if (Vars.operationCode.MSGID_HIT_JP.name().equals(cmd)) {
//            processHitInfo(params);
//        } else if (Vars.operationCode.MSGID_JP_INFO_BROCAST.name().equals(cmd)) {
//            processPoolValue((SFSArray) params.getSFSArray("JPPoolValueArray"));
//        }
        
        processHitInfo();
        
        processPoolValue();

        return null;
    }

    private void processPoolValue() {
    }

    private void processHitInfo() {
    }
    
    
}
