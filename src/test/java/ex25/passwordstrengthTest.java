/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */

package ex25;

import junit.framework.TestCase;

public class passwordstrengthTest extends TestCase {

    public void testPasswordValidator() {
        String str4 = "12345";
        String str3 = "abcdef";
        String str2 = "abc123xyz";
        String str1 = "1337h@xorz";
        assertEquals(1, passwordstrength.passwordValidator(str1));
        assertEquals(2, passwordstrength.passwordValidator(str2));
        assertEquals(3, passwordstrength.passwordValidator(str3));
        assertEquals(4, passwordstrength.passwordValidator(str4));
    }
}