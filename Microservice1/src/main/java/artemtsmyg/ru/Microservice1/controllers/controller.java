package artemtsmyg.ru.Microservice1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceOne")

public class controller {

    @GetMapping("/Hello")
    public String hello(){
        return "Hello form microservice 1";
    }
}
