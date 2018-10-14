package bowling;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FrameGeneratorTest {

    @Test
    public void frameGeneratorRegularTest() {
        ArrayList<Frame> game = FrameGenerator.frameGenerator("regular ", 0, 5);
    }

    @Test
    public void frameGeneratorSparesTest() {
        ArrayList<Frame> game = FrameGenerator.frameGenerator("spares", 0, 10);
    }

    //strikes with method currently doesn't work
    @Test
    public void frameGeneratorStrikesTest() {
        ArrayList<Frame> game = FrameGenerator.frameGenerator("strikes", 10, 0);
    }
}