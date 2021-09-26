/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex30;

public class multitable {

    public static int multiplication(int i, int j) {

        return i * j;
    }

    public static void main(String[] args) {

        int n;

        for (int i = 1 ; i <= 12; i++)
        {
            for (int j = 1; j <= 12; j++)
            {
                n = multiplication(i, j);
                System.out.printf("%3d ", n);
            }
            System.out.println();
        }
    }
}