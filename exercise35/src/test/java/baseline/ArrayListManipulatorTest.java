package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListManipulatorTest {
    @Test
    void testPickWinnerFromArrayList() {
        ArrayListManipulator testArray = new ArrayListManipulator();
        testArray.addToArrayList("Meg");
        testArray.addToArrayList("John");
        assertEquals("Meg", testArray.pickWinnerFromArrayList());
    }
}