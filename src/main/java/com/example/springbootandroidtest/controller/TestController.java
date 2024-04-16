package com.example.springbootandroidtest.controller;

import com.example.springbootandroidtest.request.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/v1/findMember")
    public ResponseEntity<?> getFindMember(@RequestParam String id){

        log.info("id 값 = {}", id);

        return ResponseEntity.ok("success");
    }

    @PostMapping("/v1/findMember")
    public ResponseEntity<?> postFindMember(@RequestBody TestDto testDto){

        log.info("testDto.title() 값 = {}", testDto.title());
        log.info("testDto.content() 값 = {}", testDto.content());
        log.info("testDto.author()값 = {}", testDto.author());
        log.info("testDto값 = {}", testDto);


        return ResponseEntity.ok(testDto);
    }

}
