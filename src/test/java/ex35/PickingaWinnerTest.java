package ex35;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PickingaWinnerTest {

    @Test
    void choosewinner() {

        int winnernum = (int) (Math.floor(Math.random() * 5));
        assertTrue(winnernum <= 5 && winnernum >= 1);


        winnernum = (int) (Math.floor(Math.random() * 1000));
        assertTrue(winnernum <= 1000 && winnernum >= 1);



    }
}