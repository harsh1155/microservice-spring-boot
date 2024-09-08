package com.harsh.microservice.limits_service.controller;

import com.harsh.microservice.limits_service.configuration.Configuration;
import com.harsh.microservice.limits_service.entity.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retriveLimits(){

          return new Limits(configuration.getMinimum(),configuration.getMaximum());
     //   return new Limits(2,2000);

    }
}
