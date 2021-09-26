package ex33;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class magic8ballTest {

    @RepeatedTest(value = 100)
    void answersisYES() {

        String answer = "Yes.";

        assertEquals(answer, magic8ball.answers());

    }

    @RepeatedTest(value = 100)
    void answersisNO() {

        String answer = "No.";

        assertEquals(answer, magic8ball.answers());

    }

    @RepeatedTest(value = 100)
    void answersisMAYBE() {

        String answer = "Maybe.";

        assertEquals(answer, magic8ball.answers());

    }

    @RepeatedTest(value = 100)
    void answersisASKAGAINLATER() {

        String answer = "Ask again later.";

        assertEquals(answer, magic8ball.answers());

    }
}