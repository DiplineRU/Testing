package com.example.Testing.Service;

import com.example.Testing.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "<b>Hello!</b>";
    }

    public String answerhello(String userName) {
        return "Hello, " + userName;
    }

    public String helloCalculator() {
        return "Добро пожаловать в калькулятор!";
    }
}