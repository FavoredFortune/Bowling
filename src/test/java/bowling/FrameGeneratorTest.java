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

    @Test
    public void strikeFrameGeneratorTest() {
        ArrayList<Frame> game = FrameGenerator.strikeFrameGenerator("strike");
    }
}
