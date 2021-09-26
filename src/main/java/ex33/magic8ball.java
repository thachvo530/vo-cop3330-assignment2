/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex33;

import java.util.Random;
import java.util.Scanner;

public class magic8ball {

    public static String answers()
    {
        String[] response = new String[]{"Yes.", "No.", "Maybe.", "Ask again later."};
        Random random = new Random();
        int randomresponse = random.nextInt(response.length);
        String answer = response[randomresponse];

        return answer;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = scan.nextLine();

        String answer;
        answer = answers();

        System.out.println("\n" +answer);

    }


}
