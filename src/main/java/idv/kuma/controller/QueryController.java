package idv.kuma.controller;


import idv.kuma.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QueryController {


    private QueryService queryService;


    @Autowired
    public QueryController(QueryService queryService) {
        this.queryService = queryService;
    }



    @GetMapping(value = "/query/{gsId}")
    public String query(@PathVariable("gsId") String gsId) {

        return queryService.query(gsId);
    }
}
