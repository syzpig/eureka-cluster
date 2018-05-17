package com.syz.rabbit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class rabbitTestCtl {

    @Autowired
    RestTemplate restTemplate;
    public String add() {
        return restTemplate.getForEntity("http://serveruser/add?a=10&b=20", String.class).getBody();
    }
}
