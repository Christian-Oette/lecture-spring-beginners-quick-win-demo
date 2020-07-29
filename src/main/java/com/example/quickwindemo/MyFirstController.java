package com.example.quickwindemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @GetMapping
    public HelloDto hello() {
        return new HelloDto("This application is up and running");
    }

    public static class HelloDto{
        private String text;

        public HelloDto(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

}
