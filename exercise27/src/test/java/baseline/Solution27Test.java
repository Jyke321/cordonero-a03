package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution27Test {
    @Test
    public void validateInputTestForValidInput() {
        Assertions.assertEquals("There were no errors found.",
                Solution27.sol.validateInput("Jack","Daniels","32765","AA-4386"));
        }
    @Test
    public void validateInputTestForInvalidEmployeeID() {
        Assertions.assertEquals("The employee ID must be in the format of AA-1234.\n",
                Solution27.sol.validateInput("Jack","Daniels","32765","AAA4386"));
    }
    @Test
    public void validateInputTestForInvalidFirstName() {
        Assertions.assertEquals("The first name must be at least 2 characters long.\n" +
                        "The first name must be filled in.\n",
                Solution27.sol.validateInput("","Daniels","32765","AA-4386"));
    }
    @Test
    public void validateZipCodeTestInvalid() {
        Assertions.assertEquals("The zipcode must be a 5 digit number.\n",Solution27.sol.validateZipCode("327658"));
    }
    @Test
    public void validateZipCodeTestValid() {
        Assertions.assertEquals("",Solution27.sol.validateZipCode("32765"));
    }
    @Test
    public void containsNonNumbersTestTrue() {
        Assertions.assertEquals(true,Solution27.sol.containsNonNumbers("12h45"));
    }
    @Test
    public void containsNonNumbersTestFalse() {
        Assertions.assertEquals(false,Solution27.sol.containsNonNumbers("12345"));
    }
    @Test
    public void validateEmployeeIDTestInvalid() {
        Assertions.assertEquals("The employee ID must be in the format of AA-1234.\n",Solution27.sol.validateEmployeeId("327658"));
    }
    @Test
    public void validateEmployeeIDTestValid() {
        Assertions.assertEquals("",Solution27.sol.validateEmployeeId("AA-4386"));
    }
}