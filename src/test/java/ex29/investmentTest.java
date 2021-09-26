package ex29;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class investmentTest {

    @Test
    void calc() {
        assertEquals(18, investment.calc(4));
        assertEquals(3, investment.calc(20));
    }
}
