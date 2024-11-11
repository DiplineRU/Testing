package com.example.Testing;

import org.springframework.web.bind.annotation.RequestParam;

public interface HelloService {
    String hello();
    String answerhello(@RequestParam("name") String userName);
    String helloCalculator();
}
