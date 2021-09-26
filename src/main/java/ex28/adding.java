/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */



package ex28;

import java.util.Scanner;

public class adding {

    public static int calc(int n, int total)
    {

        total += n;

        return total;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            int n = scan.nextInt();
            total = calc(n, total);
        }
        System.out.print("The total is "+total+".");
    }
}

