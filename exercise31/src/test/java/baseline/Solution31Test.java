package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void testGetTargetHeartRate() {
        assertEquals(145,Solution31.sol.getTargetHeartRate(22,65,.60));
    }
}