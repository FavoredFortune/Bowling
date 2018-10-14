package bowling;

import java.util.ArrayList;

//This was the requested primary method - scoreGame - discussed on Friday.
//It is also tested using JUnit 4.2 - tests can be found in the test folder in
//the scoreGameTest file

public class Main {

    //creating games for use by main method as a primary testing harness/interaction
    //interface for users so they can see the primary application in action
    public static ArrayList<Frame> regularGame = new ArrayList<>();
    public static ArrayList<Frame> spareGame = new ArrayList<>();
    public static ArrayList<Frame> strikeGame = new ArrayList<>();

    //purpose of application is to return the score of games
    public static void main(String[] args) {
        System.out.println("\nWelcome to this bowling score generator! \nYou will now see the scores of a " +
                "regular game, a game of all spares and a game of strikes. \nEnjoy!\n" );

        //BUILDING ALL THE GAMES HERE FOR USE BY PRIMARY (SCOREGAME) METHOD
        //Regular Game
        //total score is 40
        Frame frame = new Frame(2,2);
        regularGame.add(frame);
        frame = new Frame(2,2);
        regularGame.add(frame);
        frame = new Frame(2,2);
        regularGame.add(frame);
        frame = new Frame(2,2);
        regularGame.add(frame);
        frame = new Frame(2,2);
        regularGame.add(frame);
        frame = new Frame(2,2);
        regularGame.add(frame);
        frame = new Frame(2,2);
        regularGame.add(frame);
        frame = new Frame(2,2);
        regularGame.add(frame);
        frame = new Frame(2,2);
        regularGame.add(frame);
        frame = new Frame(2,2);
        regularGame.add(frame);

        //Spares game
        //total score is 150
        Frame frameB = new Frame(5,5);
        spareGame.add(frameB);
        frameB = new Frame(5,5);
        spareGame.add(frameB);
        frameB = new Frame(5,5);
        spareGame.add(frameB);
        frameB = new Frame(5,5);
        spareGame.add(frameB);
        frameB = new Frame(5,5);
        spareGame.add(frameB);
        frameB = new Frame(5,5);
        spareGame.add(frameB);
        frameB = new Frame(5,5);
        spareGame.add(frameB);
        frameB = new Frame(5,5);
        spareGame.add(frameB);
        frameB = new Frame(5,5);
        spareGame.add(frameB);
        frameB = new Frame(5,5,5);
        spareGame.add(frameB);

        //Perfect game of all strikes
        //total score is 300
        Frame frameC = new Frame(10,0);
        strikeGame.add(frameC);
        frameC = new Frame(10,0);
        strikeGame.add(frameC);
        frameC = new Frame(10,0);
        strikeGame.add(frameC);
        frameC = new Frame(10,0);
        strikeGame.add(frameC);
        frameC = new Frame(10,0);
        strikeGame.add(frameC);
        frameC = new Frame(10,0);
        strikeGame.add(frameC);
        frameC = new Frame(10,0);
        strikeGame.add(frameC);
        frameC = new Frame(10,0);
        strikeGame.add(frameC);
        frameC = new Frame(10,0);
        strikeGame.add(frameC);
        frameC = new Frame(10,10,10);
        strikeGame.add(frameC);
        //score is 300

        try{ Thread.sleep(2000);
        } catch(Exception e){
            e.printStackTrace();
        }

        scoreGame(regularGame);
        try{ Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }
        scoreGame(spareGame);
        try{ Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }
        scoreGame(strikeGame);
        try{ Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Thanks for playing!");
        try{ Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("\nIf you'd like to see randomly generate bowling rolls and then see a game scored then " +
                "please go into the IDE and run \"FrameGenerator\" for more fun.");
    }

    public static int scoreGame(ArrayList<Frame> game) {

        //value that will be used to iterate through each frame and create a sum of all the frame scores
        int score = 0;

        int size = game.size();

        //edge case that the game provided has no scores
        if(size == 0){
            System.out.println("Hmm. That's strange. It looks like this game has no scores. \nTotal game score of ");
            return score;
        }

        //iterate through game scores for each frame except special case, last frame
        for(int i = 0; i < 9; i ++){

            //regular case
            if (game.get(i).frameTotal < 10){
                score += game.get(i).frameTotal;
            }

            //spare case
            if(game.get(i).frameTotal == 10 && game.get(i).roll1 < 10){
                score += game.get(i).frameTotal;
                score += game.get(i+1).roll1;
            }

            //strikes case
             if (game.get(i).roll1 == 10){
                 score+= game.get(i).roll1;
                 if(game.get(i+1).roll1 == 10 && i < 8) {
                     score += game.get(i + 1).roll1;
                     score += game.get(i + 2).roll1;
                 }
                 //last frame special case for perfect game
                 if(game.get(i).roll1 == 10 && i == 8 && game.get(i+1).roll1 ==10){
                     score += game.get(9).roll1;
                     score += game.get(9).roll2;
                 }
                 else {
                     score += game.get(i+1).roll2;
                 }
             }
        }
        score += game.get(9).frameTotal;
        System.out.println("The final score of this game is "+ score +"!\n");
        return score;
    }
}

