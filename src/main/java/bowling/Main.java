package bowling;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Frame> game = new ArrayList<>();

    //main method here acts as a main test harness for the primary method - score games
    //purpose of application is to return the score of games
    public static void main(String[] args) {
//        game = FrameGenerator.frameGenerator("spares", 0, 10);
//        scoreGame(game);

        game = FrameGenerator.frameGenerator("regular", 0, 5);
        scoreGame(game);
//
//        game = FrameGenerator.strikeFrameGenerator("strikes");
//        scoreGame(game);
    }



    private static int scoreGame(ArrayList<Frame> game) {

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

            //for debugging to find error - off by one error!
            System.out.println("index i roll 1 " + game.get(i).roll1);
            System.out.println("index i+1 roll 1 " + game.get(i+1).roll1);

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
                 score+= game.get(i+1).roll1;
                 if(game.get(i+1).roll1 == 10){
                     score += game.get(i+2).roll1;
                 } else {
                     score += game.get(i+1).roll2;
                 }
             }
        }
        score += game.get(9).frameTotal;

        System.out.println("The final score of this game is "+ score);
        return score;
    }
}

