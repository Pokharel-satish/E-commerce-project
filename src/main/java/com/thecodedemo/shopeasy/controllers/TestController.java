 package com.thecodedemo.shopeasy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
 public class TestController{
   @GetMapping(value="/best")
    public String test(){
         return "hi";
    }

 }