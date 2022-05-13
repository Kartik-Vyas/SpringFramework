package com.vyas.Learnspringframework.sample.enterprise.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private BusinessService businessService;
    @GetMapping("/sum")
    public long displaceSum()
    {
        return businessService.calculateSum();
    }
}

//Business Logic

@Component
class BusinessService
{
    @Autowired
    private DataService dataService;
    public long calculateSum()
    {
        List<Integer> data = dataService.retrieveData();
        return data.stream().reduce(Integer :: sum).get();
    }
}
//Getting data
@Component
class DataService
{
    public List<Integer> retrieveData()
    {
        return List.of(12,34,56,78,90);
    }
}
