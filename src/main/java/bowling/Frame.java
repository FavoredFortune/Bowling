package bowling;

public class Frame {

    int roll1;
    int roll2;
    int roll3;
    int frameTotal;

    //constructor of all but 10th frame in bowling game
    public Frame (int roll1, int roll2){
        this.roll1 = roll1;
        this.roll2 = roll2;
        this.roll3 = 0;
        this.frameTotal = roll1 + roll2 + roll3;
    }

    //constructor for the 10th frame in bowling game
    public Frame (int roll1, int roll2, int roll3){
        this.roll1 = roll1;
        this.roll2 = roll2;
        this.roll3 = roll3;

        this.frameTotal = roll1 + roll2 + roll3;
    }

    public String toString(Frame frame){
        return ("This frame scores are, Roll 1: " + frame.roll1 + " Roll 2: " + frame.roll2 + "and if the 10th frame," +
                " Roll 3 may be other than 0 - Roll 3 is: " + frame.roll3);
    }
}
