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

    //constructor for 10th frame in bowling game
    public Frame (int roll1, int roll2, int roll3){
        this.roll1 = roll1;
        this.roll2 = roll2;
        this.roll3 = roll3;

        this.frameTotal = roll1 + roll2 + roll3;
    }
}
