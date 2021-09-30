package baseline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    public void getNumberOfYearsToDoubleInvestmentBasedOnUserInputtedRate() {
        assertEquals(18,Solution29.calculateYearsToDoubleInvestment(4));
    }
}