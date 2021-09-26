/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex38;


import java.util.ArrayList;
import java.util.Scanner;

public class FilteringValues {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Emter a list of numbers, separated by spaces: ");
        String numbers = scan.nextLine();

        String[] numberList = numbers.split(" ");

        Integer[] evenNumArray = filterEvenNumbers(numberList);

        System.out.print("The even numbers are ");

        for (int i = 0; i < evenNumArray.length; i++)
        {
            System.out.print(""+evenNumArray[i]+". ");
        }

    }

    public static Integer[] filterEvenNumbers(String[] numberList)
    {
        ArrayList<Integer> intnumberlist = new ArrayList<>();

        for(int i = 0; i < numberList.length; i++)
        {
            int number = Integer.parseInt(numberList[i]);

            if (number % 2 == 0)
            {
                intnumberlist.add(number);
            }
        }
        Integer[] evenNumArray = new Integer[intnumberlist.size()];
        evenNumArray = intnumberlist.toArray(evenNumArray);

        return evenNumArray;
    }
}

