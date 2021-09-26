package ex32;

import org.junit.jupiter.api.Test;

import java.awt.font.NumericShaper;

import static org.junit.jupiter.api.Assertions.*;

class guessinggameTest {

    @Test
    void randomnumber() {
        int answer = (int) (Math.random() * 10 + 1);
        assertTrue(answer <= 10 && answer >= 1);

        answer = (int) (Math.random() * 100 + 1);
        assertTrue(answer <= 100 && answer >= 1);

        answer = (int) (Math.random() * 1000 + 1);
        assertTrue(answer <= 1000 && answer >= 1);


    }
}


