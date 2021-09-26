/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    static boolean isAnagram(String word1, String word2) {

        int length1 = word1.length();
        int length2 = word2.length();

        if (length1 != length2)
        {
            return false;
        }

        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < length1; i++)
            if (array1[i] != array2[i])
                return false;

        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");

        System.out.print("Enter the first string: ");
        String word1 = scan.nextLine();

        System.out.print("Enter the second string: ");
        String word2 = scan.nextLine();

        if(isAnagram(word1, word2)) {
            System.out.print("" + word1 + " and " + word2 + " are anagrams.");
        }
        else {
            System.out.print("" + word1 + " and " + word2 + " are not anagrams.");
        }

    }
}