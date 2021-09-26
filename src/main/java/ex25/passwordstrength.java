/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class passwordstrength {

    public static int passwordValidator(String password)
    {

        boolean letter = false, digit = false, specialCharacter = false;
        int length = password.length();
        int strengthnumber = 0;

        Set<Character> set = new HashSet<>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+', '-','_','=','+','[','{',']','}','|',';',':','"', ',', '<', '>', '.', '/', '?', '\'', '\\'));

        for (char i : password.toCharArray()) {
            if (set.contains(i))
            {
                specialCharacter = true;
            }
            if (Character.isDigit(i))
            {
                digit = true;
            }
            if (Character.isLetter(i))
            {
                letter = true;
            }

        }

        if (letter & digit & specialCharacter & length >= 8)
        {
            strengthnumber = 1;
        }

        else if (letter & digit & length >= 8)
        {

            strengthnumber = 2;
        }

        else if (letter & length < 8)
        {
            strengthnumber = 3;
        }

        else if (digit & length < 8)
        {
            strengthnumber = 4;
        }
        return strengthnumber;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        String strength = "";

        int strengthnumber = passwordValidator(password);


        if (strengthnumber == 1)
        {
            strength = "very strong";
        }
        else if (strengthnumber == 2)
        {
            strength = "strong";
        }
        else if (strengthnumber == 3)
        {
            strength = "weak";
        }
        else if (strengthnumber == 4)
        {
            strength = "very weak";
        }

        System.out.print("The password '"+password+"' is "+strength+" password.");

    }
}



