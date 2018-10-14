package bowling;

import java.util.ArrayList;

import static bowling.Main.sleep;

public class FrameGenerator {

    public static void main(String[] args) {
        System.out.println("\nWelcome to the random bowling game generator! \nThis application randomly generates all" +
                " " +
                "the rolls of a bowling game with the following rules:");

        sleep(4000);
        System.out.println("- Regular-type games will never have a roll over 5 and never have a frame with a total above 5 \n- Spare-type games will always have frame totals of 10 except the last frame and the first frame will never be a strike (aka" +
                " 10) \n- Perfect Strike-type games will always have a first roll of 10 for each frame and the last " +
                "three " +
                "rolls of the last frame will each be 10");

        sleep(4000);

        System.out.println("\nEnjoy! \nDon't forget to checkout the README file for full instructions and fun bowling" +
                " " +
                "facts" +
                ".\n");

        sleep(5000);

        ArrayList<Frame> game;

        game = frameGenerator("REGULAR", 0, 5);
        Main.scoreGame(game);
        sleep(1000);

        game = frameGenerator("SPARES", 0, 10);
        Main.scoreGame(game);
        sleep(1000);

        game = strikeFrameGenerator("PERFECT STRIKES");
        Main.scoreGame(game);
        sleep(1000);

        System.out.println("Thanks for playing!");

        sleep(500);

        System.out.println("\nDid that go by too fast? Scroll up to the top of the console for details and then " +
                "scroll down to see what happened.\nPlease contact FavoredFortune for more bowling game ideas at github.com/FavoredFortune.");
    }

    //helper method for testing - generates random played games by type - choosing the min and max score
    //options are a game of all spare frames or all "regular" frames where frames 1 - 9 have a total of no more than
    // 5 per frame
    public static ArrayList<Frame> frameGenerator(String type, int minRoll, int maxRoll){

        ArrayList<Frame> scores = new ArrayList<>();

        //game type
        System.out.println("This is a " + type + " bowling game where no roll exceeds " + maxRoll +"\nand none of the" +
                        " first 9 frames can exceed a total of " + maxRoll+ " pins knocked over in any frame.");

        sleep(2000);

        //generate initial 2 rolls of first frame of game randomly
        System.out.println("Let's get started with the first frame!");
        int roll1 = minRoll+(int) (Math.random()*(maxRoll-minRoll-1)+1);
        System.out.println("Roll 1: " + roll1);
        sleep(250);

        int roll2 = maxRoll - roll1;
        System.out.println("Roll 2: " + roll2);
        sleep(250);

        Frame frame = new Frame(roll1, roll2);
        scores.add(frame);

        //create next 8 frames of game randomly using bounds of max & min parameters to determine scores
        // each frame cannot exceed a total of 10 points
        for(int i = 1; i < 9; i++) {
            roll1 = minRoll+(int) (Math.random()*(maxRoll-minRoll-1)+1);
            System.out.println("Roll 1: " + roll1);
            sleep(250);

            roll2 = maxRoll - roll1;
            System.out.println("Roll 2: " + roll2);
            sleep(250);

            frame = new Frame(roll1, roll2);
            scores.add(frame);
        }

        System.out.println("Here comes the LAST FRAME: ");
        //create last, special 10th frame of game...adds drama!
        roll1 = minRoll+ (int) (Math.random()*(maxRoll-minRoll-1)+1);
        System.out.println("Roll 1: " + roll1);
        sleep(250);

        roll2 = maxRoll - roll1;
        System.out.println("Roll 2: " + roll2);
        sleep(250);

        int roll3 = minRoll+(int) (Math.random()*(maxRoll-minRoll)+1);
        System.out.println("Roll 3: " + roll3);
        sleep(250);

        frame = new Frame(roll1, roll2, roll3);
        scores.add(frame);

        //return full game of 10 frame scores
        return scores;
    }

    //generates special case of perfect game (all strikes)
    //keeping much of the original frame generator structure, should this pattern be updated/reused
    //to create mix of strikes and non-strikes for a game later
    public static ArrayList<Frame> strikeFrameGenerator(String type){
        ArrayList<Frame> scores = new ArrayList<>();

        //game type
        System.out.println("This is a " + type + " bowling game where ever roll is a strike.");
        sleep(2000);

        //generate initial 2 rolls of first frame of game randomly
        System.out.println("Let's get started with the first frame!");
        int roll1 = 10;
        System.out.println("Roll 1: " + roll1);
        sleep(250);

        int roll2 = 0;
        System.out.println("Roll 2: " + roll2);
        sleep(250);

        Frame frame = new Frame(roll1, roll2);
        scores.add(frame);

        //create next 8 frames of game
        for(int i = 1; i < 9; i++) {
            roll1 = 10;
            System.out.println("Roll 1: " + roll1);
            sleep(250);

            roll2 = 0;
            System.out.println("Roll 2: " + roll2);
            sleep(250);

            frame = new Frame(roll1, roll2);
            scores.add(frame);
        }

        System.out.println("Last Frame: ");
        //create last, special 10th frame of game
        int roll = 10;
        System.out.println("Roll 1: " + roll);
        sleep(250);

        System.out.println("Roll 2: " + roll);
        sleep(250);

        System.out.println("Roll 3: " + roll);
        sleep(250);

        frame = new Frame(roll, roll, roll);
        scores.add(frame);

        //return full game of 10 frame scores
        return scores;
    }
}
