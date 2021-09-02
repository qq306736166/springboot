package com.Application.controller;

import com.entity.AppAddvertEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/admin/addvert")
public class AppAddvertController {

    @Autowired
    private AppAddvertEntity appAddvertEntity;
    

}
