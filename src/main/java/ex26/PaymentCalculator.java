/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex26;

import java.util.Scanner;

public class PaymentCalculator {

    public static double calculateMonthsUntilPaidoff(double b, double APR, double p)
    {
        APR = APR/100;
        double i = APR / 365;
        double months = Math.ceil(-(1 / 30.0) * Math.log(1 + b / p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i));

        return (int) months;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double i = 0;

        System.out.print("What is your balance? ");
        Double b = scan.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        Double APR = scan.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        Double p = scan.nextDouble();

        double months = calculateMonthsUntilPaidoff(b, APR, p);
        int month = (int) months;

        System.out.print("It will take you "+ month +" months to pay off this card.");
    }
}




