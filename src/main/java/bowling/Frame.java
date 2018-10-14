package bowling;

/*Difference between now and Friday in this object - the new property - frame total.
Felt frame total being a property of a frame was a bit cleaner on retrospect and
easier for generating game scores and testing scoreGame method.
 */

public class Frame {

    int roll1;
    int roll2;
    int roll3;
    //note that frame total isn't the same as a score for that frame
    //this just adds the roll values together
    //scoreGame method correctly tallies the score of each frame, since it's reliant
    //on the next frame to score correctly in many cases (like spares and strikes)
    int frameTotal;

    //constructor of frames 1 - 9 in the bowling game
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
}
