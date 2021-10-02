package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {
    @Test
    void testGetEightBallFortuneIfRandomValueIs1() {
        Magic8Ball ball = new Magic8Ball();
        assertEquals("No", ball.getString(1));
    }
}