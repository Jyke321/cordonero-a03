package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void getSumFromArrayListTest() {
        ArrayList array = new ArrayList(
                Arrays.asList(1,2,3,4,5));
        assertEquals(15,Solution28.getSumFromArrayList(array));
    }
}