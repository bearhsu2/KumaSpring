package idv.kuma.contribution.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContributionController {

    @RequestMapping(value = "/contribute", method = RequestMethod.POST)
    public String contribute(){



        return "success";
    }
}