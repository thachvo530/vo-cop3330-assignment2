/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex32;


import java.util.Scanner;

public class guessinggame {


    public static int randomnumber(int difficulty)
    {
        int answer = 0;
        if ( difficulty == 1)
        {
            answer = (int) (Math.random() * 10 + 1);
        }
        if ( difficulty == 2)
        {
            answer = (int) (Math.random() * 100 + 1);
        }
        if ( difficulty == 3)
        {
            answer = (int) (Math.random() * 1000 + 1);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play the Guess the Number!");
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        int difficulty = scan.nextInt();

        int answer = 0;
        answer = randomnumber(difficulty);

        System.out.print("I have my number. What's your guess? ");

        int count = 0;
        int guess = 0;

        do {
            guess = scan.nextInt();
            count++;
            if (guess == answer)
            {
                System.out.print("You got it in "+count+" guesses!");
                break;
            }
            else if (guess < answer)
            {
                System.out.print("Too low. Guess again: ");
            }
            else if (guess > answer)
            {
                System.out.print("Too high. Guess again: ");
            }

        } while (guess != answer);

        System.out.print("\nDo you wish to play again (Y/N)? ");
        String choice = scan.next();
        if (choice.equalsIgnoreCase("Y")) {
            main(null);
        }
        if (choice.equalsIgnoreCase("y"))
        {
            main(null);
        }
    }
}
