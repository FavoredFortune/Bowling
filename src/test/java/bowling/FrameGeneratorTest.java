package bowling;

import org.junit.Test;

import java.util.ArrayList;

import static bowling.Main.strikeGame;



public class FrameGeneratorTest {

    //note because games are randomly generated numbers a regular game the score each time will be different
    //this is why rolls are printed out, so one can manually check the totals provided for final scores
    //against the random rolls
    @Test
    public void frameGeneratorRegularTest() {
        ArrayList<Frame> game = FrameGenerator.frameGenerator("regular ", 0, 5);
    }

    @Test
    public void frameGeneratorSparesTest() {
        ArrayList<Frame> game = FrameGenerator.frameGenerator("spares", 0, 10);

    }

    @Test
    public void strikeFrameGeneratorTest() {

        ArrayList<Frame> game = FrameGenerator.strikeFrameGenerator("strike");

        assertArrayEquals(strikeGame, game);
    }

    //due to each array having a special generic type (the Frame object created in this application)
    //special assertion test needed to be written to compare actual vs. expected
    //game ArrayLists
    private boolean assertArrayEquals(ArrayList<Frame> strikeGame, ArrayList<Frame> game) {
        boolean result = false;
        for(int i = 0; i < strikeGame.size(); i ++){
         if(strikeGame.get(i) == game.get(i)){
             result = true;
         } else {
             return result;
         }
        }
        return result;
    }
}
