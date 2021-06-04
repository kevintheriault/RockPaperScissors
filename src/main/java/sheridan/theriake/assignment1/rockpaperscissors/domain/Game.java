package sheridan.theriake.assignment1.rockpaperscissors.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Random;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Game implements Serializable {

    @Min(0)
    @Max(2)
    private int choice;
    private int computer;
    private boolean win = false;
    private boolean tie = false;
    private boolean loss = false;

    private Random random = new Random();

    private final Logger logger = LoggerFactory.getLogger(Game.class);

    public Game() {
        logger.trace("Game initialized");
        this.computer = random.nextInt(3); // Default constructor makes computer choice.
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        logger.trace("setComputer() called.");
        this.computer = computer;
    }

    public boolean isWin() {
        return win;
    }

    public boolean isLoss() {
        return loss;
    }

    public boolean isTie() {
        return tie;
    }

    public void winOrLose(){
        if(getChoice() == getComputer()){
            tie = true;
        }else if(getChoice() == 0 && getComputer() == 2){
            win = true;
        }else if(getChoice() == 1 && getComputer() == 0){
            win = true;
        }else if(getChoice() == 2 && getComputer() == 1){
            win = true;
        }else{
            loss = true;
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "choice=" + choice +
                ", computer=" + computer +
                '}';
    }
}
