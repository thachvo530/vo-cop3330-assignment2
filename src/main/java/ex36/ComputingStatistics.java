/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputingStatistics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numberlist = new ArrayList<>();
        String number = "";

        do {
            System.out.print("Enter a number: ");
            number = scan.next();

            if (!number.equals("done")) {
                try {
                    int n = Integer.parseInt(number);
                    numberlist.add(n);
                } catch (NumberFormatException nfe) {

                }

            }

        }while(!number.equals("done"));

        System.out.printf("The average is %.1f", average(numberlist));
        System.out.printf("\nThe maximum is %d", max(numberlist));
        System.out.printf("\nThe minimum is %d", min(numberlist));
        System.out.printf("\nThe standard deviation is %.2f", std(numberlist));
    }

    public static double average(ArrayList<Integer> numberList){

        int total = 0;

        for (int i = 0; i < numberList.size(); i++)
        {
            total += numberList.get(i);
        }
        double avg = (double)(total)/numberList.size();
        return avg;
    }

    public static int max(ArrayList<Integer> numberList){

        int max = 0;
        for (int i = 0; i < numberList.size(); i++)
        {
            if (max < numberList.get(i))
            {
                max = numberList.get(i);
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> numberList)
    {
        int min = numberList.get(0);
        for (int i = 0; i < numberList.size(); i++)
        {
            if (min > numberList.get(i))
            {
                min = numberList.get(i);
            }
        }
        return min;
    }

    public static double std(ArrayList<Integer> numberList)
    {
        double mean = average(numberList);
        double population = 0;
        for (int i = 0; i < numberList.size(); i++)
        {
            population += Math.pow((numberList.get(i) - mean), 2);
        }

        double standardDev = Math.sqrt(population/ numberList.size());

        return standardDev;
    }

}

