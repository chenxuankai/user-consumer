package com.example.web.controller;

import com.example.dao.domain.UserDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public UserDo findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:8001/"+id, UserDo.class);
    }

}
