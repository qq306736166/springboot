package com.controller;

import com.entity.AppAddvertEntity;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping("/test")
    public String getTest() {
        AppAddvertEntity entity = new AppAddvertEntity();
        return entity.getAddvercontext();
    }
}
