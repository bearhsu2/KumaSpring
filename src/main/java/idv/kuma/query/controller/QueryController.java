package idv.kuma.query.controller;


import idv.kuma.query.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QueryController {


    @Autowired
    QueryService queryService;


    @RequestMapping(value = "/query/{gsId}", method = RequestMethod.GET)
    public String query(@PathVariable("gsId") String gsId) {


        return queryService.query(gsId);
    }
}
