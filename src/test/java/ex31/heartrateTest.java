/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class heartrateTest {

    @Test
    void heartratecalc() {
        assertEquals(191, heartrate.heartratecalc(55, 22, 65));
        assertEquals(116, heartrate.heartratecalc(55, 100, 50));
    }
}