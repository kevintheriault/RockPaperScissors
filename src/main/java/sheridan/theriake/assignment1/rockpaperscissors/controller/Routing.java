package sheridan.theriake.assignment1.rockpaperscissors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Routing {
    @GetMapping("/Input")
    public String input(){
        return "Input";
    }

    @GetMapping("/Output")
    public String output(){
        return "Output";
    }
}
