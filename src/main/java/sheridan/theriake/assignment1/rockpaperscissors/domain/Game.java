package sheridan.theriake.assignment1.rockpaperscissors.domain;

import java.io.Serializable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Game implements Serializable {

    @Min(0)
    @Max(2)
    @NotBlank
    int choice;

    public Game() {
    }

    public Game(int choice){
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "Game{" +
                "choice=" + choice +
                '}';
    }
}
