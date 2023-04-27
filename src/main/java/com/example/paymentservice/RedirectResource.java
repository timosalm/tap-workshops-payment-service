package com.example.paymentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class RedirectResource {

    @GetMapping(value = "/")
    public void redirectToServices(HttpServletResponse httpServletResponse) {
            httpServletResponse.setHeader("Location", HelloWorldResource.BASE_URI);
            httpServletResponse.setStatus(302);
    }
}
