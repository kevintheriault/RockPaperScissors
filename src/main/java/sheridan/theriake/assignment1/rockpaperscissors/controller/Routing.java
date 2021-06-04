package sheridan.theriake.assignment1.rockpaperscissors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import sheridan.theriake.assignment1.rockpaperscissors.domain.Game;

@Controller
public class Routing {
    @GetMapping("/Input")
    public ModelAndView input() {
//        return "Input";
        return new ModelAndView("Input", "game", new Game());
    }

    @GetMapping("/Output")
    public ModelAndView output(@Validated @ModelAttribute Game game, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return new ModelAndView("Input");
        }
        return new ModelAndView("Output", "game", game);
    }
}
