package bowling;

import java.util.ArrayList;

public class FrameGenerator {

    public static void main(String[] args) {
        System.out.println("\nWelcome to the random bowling game generator! \nThis application randomly generates all" +
                " " +
                "the rolls of a bowling game with the following rules:");

        try{ Thread.sleep(4000);
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("- Regular-type games will never have a roll over 5 and never have a frame with a total above 5 \n- Spare-type games will always have frame totals of 10 except the last frame and the first frame will never be a strike (aka" +
                " 10) \n- Perfect Strike-type games will always have a first roll of 10 for each frame and the last " +
                "three " +
                "rolls of the last frame will each be 10");

        try{ Thread.sleep(4000);
        } catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("\nEnjoy! \nDon't forget to checkout the readme for full instructions and fun bowling " +
                "facts" +
                ".\n");

        try{ Thread.sleep(5000);
        } catch(Exception e){
            e.printStackTrace();
        }

        ArrayList<Frame> game;

        game = frameGenerator("REGULAR", 0, 5);
        Main.scoreGame(game);
        try{ Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }

        game = frameGenerator("SPARES", 0, 10);
        Main.scoreGame(game);
        try{ Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }

        game = strikeFrameGenerator("PERFECT STRIKES");
        Main.scoreGame(game);
        try{ Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Thanks for playing!");

        try{ Thread.sleep(500);
        } catch(Exception e){
            e.printStackTrace();
        }

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

        try{ Thread.sleep(2000);
        } catch(Exception e){
            e.printStackTrace();
        }

        //generate initial 2 rolls of first Spare frame of game randomly
        int roll1 = minRoll+(int) (Math.random()*(maxRoll-minRoll-1)+1);
        System.out.println(roll1);
        try{ Thread.sleep(250);
        } catch(Exception e){
            e.printStackTrace();
        }

        int roll2 = maxRoll - roll1;
        System.out.println(roll2);
        try{ Thread.sleep(250);
        } catch(Exception e){
            e.printStackTrace();
        }

        Frame frame = new Frame(roll1, roll2);
        scores.add(frame);

        //create next 8 frames of game
        for(int i = 1; i < 9; i++) {
            roll1 = minRoll+(int) (Math.random()*(maxRoll-minRoll-1)+1);
            System.out.println(roll1);
            try{ Thread.sleep(250);
            } catch(Exception e){
                e.printStackTrace();
            }

            roll2 = maxRoll - roll1;
            System.out.println(roll2);
            try{ Thread.sleep(250);
            } catch(Exception e){
                e.printStackTrace();
            }

            frame = new Frame(roll1, roll2);
            scores.add(frame);
        }

        //create last, special 10th frame of game
        roll1 = minRoll+ (int) (Math.random()*(maxRoll-minRoll-1)+1);
        System.out.println("LAST FRAME: \n" + roll1);
        try{ Thread.sleep(250);
        } catch(Exception e){
            e.printStackTrace();
        }
        roll2 = maxRoll - roll1;
        System.out.println(roll2);
        try{ Thread.sleep(250);
        } catch(Exception e){
            e.printStackTrace();
        }
        int roll3 = minRoll+(int) (Math.random()*(maxRoll-minRoll)+1);
        System.out.println(roll3);
        try{ Thread.sleep(250);
        } catch(Exception e){
            e.printStackTrace();
        };

        frame = new Frame(roll1, roll2, roll3);
        scores.add(frame);

        //return full game of 10 frame scores
        return scores;
    }

    public static ArrayList<Frame> strikeFrameGenerator(String type){
        ArrayList<Frame> scores = new ArrayList<>();

        //game type
        System.out.println("This is a " + type + " bowling game where ever roll is a strike.");
        try{ Thread.sleep(2000);
        } catch(Exception e){
            e.printStackTrace();
        }

        //generate initial 2 rolls of first Spare frame of game randomly
        int roll1 = 10;
        System.out.println(roll1);
        try{ Thread.sleep(250);
        } catch(Exception e){
            e.printStackTrace();
        }

        int roll2 = 10 - roll1;
        System.out.println(roll2);
        try{ Thread.sleep(250);
        } catch(Exception e){
            e.printStackTrace();
        }

        Frame frame = new Frame(roll1, roll2);
        scores.add(frame);

        //create next 8 frames of game
        for(int i = 1; i < 9; i++) {
            roll1 = 10;
            System.out.println(roll1);
            try{ Thread.sleep(250);
            } catch(Exception e){
                e.printStackTrace();
            }

            roll2 = 10 - roll1;
            System.out.println(roll2);
            try{ Thread.sleep(250);
            } catch(Exception e){
                e.printStackTrace();
            }

            frame = new Frame(roll1, roll2);
            scores.add(frame);
        }

        System.out.println("Last Frame: ");
        //create last, special 10th frame of game
        int roll = 10;
        System.out.println(roll);
        try{ Thread.sleep(250);
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(roll);
        try{ Thread.sleep(250);
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(roll);
        try{ Thread.sleep(250);
        } catch(Exception e){
            e.printStackTrace();
        }

        frame = new Frame(roll, roll, roll);
        scores.add(frame);

        //return full game of 10 frame scores
        return scores;
    }
}
