package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {
    EmployeeList testList = new EmployeeList();
    @BeforeEach
    void initTestList() {
        testList = new EmployeeList();
    }

    @Test
    void testRemoveChrisJonesFromList() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson",
                "Amanda Cullen", "Jeremy Goodwin"));
        testList.removeEmployees("Chris Jones");
        assertArrayEquals(new ArrayList[]{expected}, new ArrayList[]{testList.employees});
    }
    @Test
    void testGetNumberOfEmployees() {
        assertEquals(5,testList.getNumberOfEmployees());
    }

}