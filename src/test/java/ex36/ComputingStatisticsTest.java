package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ComputingStatisticsTest {

    @Test
    void average() {

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(100);
        numberList.add(200);
        numberList.add(300);
        numberList.add(1000);

        assertEquals(400,ComputingStatistics.average(numberList));


    }

    @Test
    void max() {

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(100);
        numberList.add(200);
        numberList.add(300);
        numberList.add(1000);

        assertEquals(1000, ComputingStatistics.max(numberList));

    }

    @Test
    void min() {

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(100);
        numberList.add(200);
        numberList.add(300);
        numberList.add(1000);

        assertEquals(100, ComputingStatistics.min(numberList));
    }

    @Test
    void std() {

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(100);
        numberList.add(200);
        numberList.add(300);
        numberList.add(1000);

        double answer = ComputingStatistics.std(numberList);

        assertEquals(answer, ComputingStatistics.std(numberList));

    }
}