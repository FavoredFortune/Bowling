package bowling;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Frame> game = new ArrayList<>();

    public static void main(String[] args) {
        game = FrameGenerator.frameGenerator("spares", 0, 10);
        scoreGame(game);

        game = FrameGenerator.frameGenerator("regular", 0, 5);
        scoreGame(game);
    }



    private static int scoreGame(ArrayList<Frame> game) {
     int score = 0;

     return score;
    }


}

