package sheridan.theriake.assignment1.rockpaperscissors.domain;

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

    public Game() {
    }

    public Game(int choice){
        this.choice = choice;
        this.computer = random.nextInt(2);
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
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Game{" +
                "choice=" + choice +
                ", computer=" + computer +
                '}';
    }
}
