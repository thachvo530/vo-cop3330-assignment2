/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */

package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class PasswordGen {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int length = scan.nextInt();

        System.out.print("How many special characters? ");
        int specCharnum = scan.nextInt();

        System.out.print("How many numbers? ");
        int num = scan.nextInt();

        System.out.print("Your password is "+createpass(length, specCharnum, num));


    }

    public static String createpass(int length, int specCharnum, int num){

        Random rng = new Random();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specChar = "!@#$%^&*()-_=+[{]}|\\;:'\"<.>/?";
        String nums = "123456789";

        ArrayList<Character> password = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < specCharnum; i++)
        {
            password.add(specChar.charAt(rng.nextInt(specChar.length())));
            length++;
        }

        for (int i = 0; i < num; i++)
        {
            password.add(nums.charAt(rng.nextInt(nums.length())));
            length++;
        }

        for (int i = password.size() - 1; i < length; i++)
        {
            password.add(alphabet.charAt(rng.nextInt(alphabet.length())));
        }

        Collections.shuffle(password);

        String finalPassword = "";

        for (Character s: password)
        {
            finalPassword += Character.toString(s);
        }

        return finalPassword;
    }
}
