/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilteringValuesTest {

    @Test
    void filterEvenNumbers() {

        Integer[] arr1 = new Integer[]{2,4,6,8};

        String[] numberList = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};

        Integer[] evenNumArray = new Integer[]{};

        evenNumArray = FilteringValues.filterEvenNumbers(numberList);

        assertEquals(arr1.length, evenNumArray.length);
        assertSame(arr1[0], evenNumArray[0]);
        assertSame(arr1[1], evenNumArray[1]);
        assertSame(arr1[2], evenNumArray[2]);
        assertSame(arr1[3], evenNumArray[3]);


    }
}