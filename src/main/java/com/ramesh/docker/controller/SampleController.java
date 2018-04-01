package com.ramesh.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


  @GetMapping("/getData")
  public String getData(){
    return "Data from controller";
  }
}
