package sheridan.theriake.assignment1.rockpaperscissors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sheridan.theriake.assignment1.rockpaperscissors.domain.Game;

@Controller
public class Routing {
    @GetMapping("/Input")
    public String input(){
//        return "Input";
        return new ModelAndView("Input", "game", new Game());
    }

    @GetMapping("/Output")
    public String output(){
        return "Output";
    }
}
