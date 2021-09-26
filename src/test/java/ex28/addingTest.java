package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addingTest {

    @Test
    void calc() {
        assertEquals(10, adding.calc(10,0));
        assertEquals(100, adding.calc(50,50));
    }
}