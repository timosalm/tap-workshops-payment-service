package com.example.paymentservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(HelloWorldResource.BASE_URI)
public class HelloWorldResource {
  
  static final String BASE_URI = "/api/v1/helloworld";

  @Value("${spring.datasource.url}")
  private String url;


  @GetMapping
  public ResponseEntity<String> helloWorld() {
    var substring = url.replace("jdbc:", "");
    return ResponseEntity.ok("Hello from " + substring.substring(0, substring.indexOf(":")).toUpperCase());
  }
}
