package artemtsmyg.ru.Microservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceTwo")

public class controller {

    @GetMapping("/Hello")
    public String hello(){
        return "Hello form microservice 2";
    }
}
