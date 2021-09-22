package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagram() {
        assertEquals(true,Solution24.isAnagram("note","tone"));
    }

    @Test
    void alphabetize() {
        assertEquals("enot",Solution24.alphabetize("note"));
    }
}