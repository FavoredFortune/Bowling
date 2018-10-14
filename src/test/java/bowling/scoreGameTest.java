package bowling;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class scoreGameTest {
    ArrayList<Frame> regularGame = new ArrayList<>();
    ArrayList<Frame> spareGame = new ArrayList<>();
    ArrayList<Frame> strikeGame = new ArrayList<>();

    @Before
    public void setUp(){
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
    }

    @Test
    public void scoreGameRegularTest() {
        int actual = Main.scoreGame(regularGame);
        int expected = 40;

        assertEquals(expected, actual);
    }

    @Test
    public void scoreGameSpareTest() {
        int actual = Main.scoreGame(spareGame);
        int expected = 150;

        assertEquals(expected, actual);
    }

    @Test
    public void scoreGameStrikeTest() {
        int actual = Main.scoreGame(strikeGame);
        int expected = 300;

        assertEquals(expected, actual);
    }
}