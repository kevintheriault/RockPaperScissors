package sheridan.theriake.assignment1.rockpaperscissors.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import sheridan.theriake.assignment1.rockpaperscissors.domain.Game;

@Controller
public class Routing {

    private final Logger logger = LoggerFactory.getLogger(Routing.class);

    @GetMapping("/Input")
    public ModelAndView input() {
        logger.trace("input() is called");
        return new ModelAndView("Input", "game", new Game());
    }

    @GetMapping("/Output")
    public ModelAndView output(@Validated @ModelAttribute Game game,
                               BindingResult bindingResult) {
        logger.trace("output() is called");
        logger.debug("Game" + game);
        if(bindingResult.hasErrors()){
            return new ModelAndView("Input");
        }

        return new ModelAndView("Output", "game", game);
    }
}
