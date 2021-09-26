package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class multitableTest {

    @Test
    void multiplication() {

     for (int i = 1; i <= 12; i++)
     {
         for (int j = 1; j <= 12; j++)
         {
             int n = i * j;
             assertEquals(n, multitable.multiplication(i,j));
         }
     }
    }

    @Test
    void multiplication2() {

        assertEquals(12,multitable.multiplication(6,2));
        assertEquals(10,multitable.multiplication(1,10));
        assertEquals(1,multitable.multiplication(1,1));
        assertEquals(144,multitable.multiplication(12,12));
    }
}