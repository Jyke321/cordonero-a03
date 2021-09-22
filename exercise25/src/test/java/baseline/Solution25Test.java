package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator() {
        assertEquals(1,Solution25.passwordValidator("12345"));
        assertEquals(0,Solution25.passwordValidator("**$**"));
    }
}