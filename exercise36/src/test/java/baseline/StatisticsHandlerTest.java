package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsHandlerTest {
    static StatisticsHandler stats = new StatisticsHandler();
    @Test
    void testValidateInputIsNumberTrue() {
        assertTrue(stats.validateInputIsNumber("123"));
    }
    @Test
    void testValidateInputIsNumberFalse() {
        assertFalse(stats.validateInputIsNumber("AB123"));
        assertFalse(stats.validateInputIsNumber("ABab"));
        assertFalse(stats.validateInputIsNumber("1buy!"));
    }
    @Test
    void testSTD() {
        ArrayList<Integer> array = new ArrayList<>(
                Arrays.asList(100,200,1000,300));
        assertEquals(353.55,stats.std(array));
    }
    @Test
    void testMin() {
        ArrayList<Integer> array = new ArrayList<>(
                Arrays.asList(100,200,1000,300));
        assertEquals(100,stats.min(array));
    }
    @Test
    void testMax() {
        ArrayList<Integer> array = new ArrayList<>(
                Arrays.asList(100,200,1000,300));
        assertEquals(1000,stats.max(array));
    }
    @Test
    void testAverage() {
        ArrayList<Integer> array = new ArrayList<>(
                Arrays.asList(100,200,1000,300));
        assertEquals(400.0,stats.average(array));
    }
}