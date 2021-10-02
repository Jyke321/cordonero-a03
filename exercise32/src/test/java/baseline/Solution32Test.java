package baseline;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {
    Solution32 sol = new Solution32();
    @Test
    void testGetRandomNumberToGuess() {
        assertEquals(5,sol.getRandomNumberToGuess(1),5);
    }
    @Test
    void testGetWhetherGuessIsSame() {
        assertEquals("same",sol.getWhetherGuessIsLowHighOrSame(1,1));
    }
    @Test
    void testGetWhetherGuessIsHigh() {
        assertEquals("high",sol.getWhetherGuessIsLowHighOrSame(5,3));
    }
    @Test
    void testGetWhetherGuessIsLow() {
        assertEquals("low",sol.getWhetherGuessIsLowHighOrSame(2,8));
    }
}