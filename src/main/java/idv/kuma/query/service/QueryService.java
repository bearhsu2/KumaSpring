package idv.kuma.query.service;

import org.springframework.stereotype.Component;

@Component
public class QueryService {

    public String query(String gsId){

        if (gsId.equals("aaa")){
            return gsId + " does not exist on " + this;
        }

        return "NO JP for " + gsId + " on " + this;
    }
}
