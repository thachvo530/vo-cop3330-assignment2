package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validinputsTest {

    @Test
    void checkfirstName() {
        assertTrue(validinputs.checkfirstName("John"));
        assertFalse(validinputs.checkfirstName("J"));
    }

    @Test
    void checklastName() {
        assertTrue(validinputs.checklastName("Johnson"));
        assertFalse(validinputs.checklastName(""));
    }

    @Test
    void checkZIP() {
        assertTrue(validinputs.checkZIP("55555"));
        assertFalse(validinputs.checkZIP("ABCDE"));
    }

    @Test
    void checkEmployeeID() {
        assertTrue(validinputs.checkEmployeeID("TK-4321"));
        assertFalse(validinputs.checkEmployeeID("A12-1234"));
    }

    @Test
    void validateInput() {
        assertEquals("There were no errors.", validinputs.validateInput("John", "Johnson", "55555", "TK-4321"));
    }
}