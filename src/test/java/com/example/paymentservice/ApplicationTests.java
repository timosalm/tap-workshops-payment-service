package com.example.paymentservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class ApplicationTests {

  @Test
  void contextLoads() { }

  @Test
  void test() {
    System.out.println(func("jdbc:h2:mem:EMOJI"));
    System.out.println(func("jdbc:postgresql://postgres-1.dev-space:5432/postgres-1"));
  }

  String func(String test) {
    String replace = test.replace("jdbc:", "");
    return replace.substring(0,replace.indexOf(":"));
  }

}
