package bowling;

import java.util.ArrayList;

public class FrameGenerator {

    //helper method for testing - generates random played games by type - choosing the min and max score
    //options are a game of all spare frames or all "regular" frames where frames 1 - 9 have a total of no more than
    // 5 per frame

    public static ArrayList<Frame> frameGenerator(String type, int minRoll, int maxRoll){

        ArrayList<Frame> scores = new ArrayList<>();

        //game type
        System.out.println("This is a " + type + " bowling game where no roll exceeds " + maxRoll +"\nand none of the" +
                        " first 9 frames can exceed " + maxRoll+ " pins rolled over in any frame.");

        //generate initial 2 rolls of first Spare frame of game randomly
        int roll1 = minRoll+(int) (Math.random()*(maxRoll-minRoll)+1);
        System.out.println(roll1);

        int roll2 = maxRoll - roll1;
        System.out.println(roll2);

        Frame frame = new Frame(roll1, roll2);
        scores.add(frame);

        //create next 8 frames of game
        for(int i = 1; i < 9; i++) {
            roll1 = minRoll+(int) (Math.random()*(maxRoll-minRoll)+1);
            System.out.println(roll1);

            roll2 = maxRoll - roll1;
            System.out.println(roll2);

            frame = new Frame(roll1, roll2);
            scores.add(frame);
        }

        //create last, special 10th frame of game
        roll1 = minRoll+ (int) (Math.random()*(maxRoll-minRoll)+1);
        roll2 = maxRoll - roll1;
        int roll3 = minRoll+(int) (Math.random()*(maxRoll-minRoll)+1);

        frame = new Frame(roll1, roll2, roll3);
        scores.add(frame);

        //return full game of 10 frame scores
        return scores;
    }
}
