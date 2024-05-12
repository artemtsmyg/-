package artemtsmyg.ru.Microservice3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceThree")

public class controller {

    @GetMapping("/Hello")
    public String hello(){
        return "Hello form microservice 3";
    }
}
