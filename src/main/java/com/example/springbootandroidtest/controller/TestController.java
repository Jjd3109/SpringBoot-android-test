package com.example.springbootandroidtest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/v1/findMember")
    public ResponseEntity<?> findMember(){

        return ResponseEntity.ok("success");
    }

}
