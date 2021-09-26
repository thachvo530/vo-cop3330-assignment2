/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex31;

import java.util.Scanner;

public class heartrate {

    public static int heartratecalc(int  intensity, int age, int rPulse)
    {
        intensity = 55;
        int TargetHeartRate = 0;
        while (intensity < 96)
        {
            TargetHeartRate = (((220 - age) - rPulse) * intensity/100) + rPulse;
            System.out.println(""+intensity+"%       | "+TargetHeartRate+"bpm ");
            intensity += 5;
        }

        return TargetHeartRate;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int rPulse = scan.nextInt();
        int age = scan.nextInt();

        System.out.println("Resting Pulse: "+rPulse+"    Age:"+age+"");
        System.out.println("Intensity | Rate");
        System.out.println("------------------");

        int intensity = 55;
        heartratecalc(intensity, age, rPulse);

    }
}
