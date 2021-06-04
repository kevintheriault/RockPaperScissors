package sheridan.theriake.assignment1.rockpaperscissors.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sheridan.theriake.assignment1.rockpaperscissors.controller.Routing;

import java.io.Serializable;
import java.util.Random;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Game implements Serializable {

    @Min(0)
    @Max(2)
    @NotBlank
    private int choice;

    @Min(0)
    @Max(2)
    @NotBlank
    private int computer;

    private Random random = new Random();

    private final Logger logger = LoggerFactory.getLogger(Routing.class);

    public Game() {
    }

    public Game(int choice, int computer){
        this.choice = choice;
        this.computer = computer;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        logger.trace("setChoice was called");
        this.choice = choice;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = random.nextInt(3); // the bound for random nums has uses less than.
        logger.trace("setComputer was called value:" + getComputer());
    }

    @Override
    public String toString() {
        return "Game{" +
                "choice=" + choice +
                ", computer=" + computer +
                '}';
    }
}
