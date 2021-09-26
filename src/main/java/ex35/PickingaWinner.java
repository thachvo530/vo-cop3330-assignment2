/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */

package ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class PickingaWinner {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int check = 0;
        int counter = 0;
        ArrayList<String> contestants = new ArrayList<>();

        while (check != 1)
        {
            System.out.print("Enter a name: ");
            String name = scan.nextLine();
            contestants.add(name);
            counter++;

            if (name.equals(""))
            {
                check = 1;
                break;
            }

        }

        int winnernumber = 0;
        winnernumber = choosewinner(counter);
        System.out.printf("The winner is... %s", contestants.get(winnernumber));
    }

    public static int choosewinner(int counter)
    {
        int winnernumber = (int) Math.floor(Math.random() * counter);

        return winnernumber;
    }
}
