/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


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