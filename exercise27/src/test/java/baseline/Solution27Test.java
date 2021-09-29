package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution27Test {
    @Test
    public void validateInputTest() {
        Assertions.assertEquals("There were no errors found.",
                Solution27.validateInput("Jack","Daniels","AA-4386","32765"));
    }

}