/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */



package ex29;

import java.util.Scanner;

public class investment {

    public static int calc(int r)
    {
        int total = 72/r;
        return total;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i = -1;
        int total = 0;

        while (i < 0) {

            try {
                System.out.print("what is the rate of return? ");
                int r = Integer.parseInt(scan.nextLine());
                total = calc(r);
                System.out.print("It will take you "+total+" to double your initial investment.");
                i = 1;

            } catch (NumberFormatException | ArithmeticException e) {
                System.out.print("Sorry. That's not a valid input.\n");
            }

        }
    }
}
