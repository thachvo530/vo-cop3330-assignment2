/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */

package ex24;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class anagramTest extends TestCase {

    @Test
    public void testIsAnagram() {
        Assertions.assertTrue(anagram.isAnagram("note", "tone"));
        Assertions.assertFalse(anagram.isAnagram("dog", "cat"));
    }


}