/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex27;

import java.util.Scanner;
import java.util.regex.Pattern;


public class validinputs {

    static String statement = "";

    public static boolean checkfirstName(String firstName)
    {
        boolean check = true;

        if (firstName.length() < 2)
        {
            statement += "The first name must be 2 characters long.\n";
            check = false;
        }

        if (firstName.length() == 0)
        {
            statement +=  "The first name must be filled in.\n";
        }

        return check;

    }

    public static boolean checklastName(String lastName)
    {
        boolean check = true;

        if(lastName.length() < 2)
        {
            statement += "The last name must be 2 characters long.\n";
            check = false;
        }

        if(lastName.length() == 0)
        {
            statement += "The last name must be filled in.\n";
            check = false;
        }

        return check;
    }

    public static boolean checkZIP(String zipCode)
    {
        boolean check = true;

        try {
            int n = Integer.parseInt(zipCode);

            if(zipCode.length() != 5)
            {
                statement += "The zipcode must be a 5 digit number.\n";
                check = false;
            }
        }
        catch (Exception e)
        {
            statement += "The zipcode must be a 5 digit number.\n";
            check = false;
        }

        return check;
    }

    public static boolean checkEmployeeID(String employeeID)
    {
        String format = "[a-zA-z]{2}[-][0-9]{4}";
        boolean check = true;

        if(!Pattern.matches(format, employeeID))
        {
            statement += "The employee ID must be in format of AA-1234.\n";
            check = false;
        }

        return check;
    }

    public static String validateInput(String firstName, String lastName, String zipCode, String employeeID)
    {

        boolean firstname = checkfirstName(firstName);
        boolean lastname = checklastName(lastName);
        boolean ZIP = checkZIP(zipCode);
        boolean ID = checkEmployeeID(employeeID);

        if (firstname & lastname & ZIP & ID)
        {
            statement = "There were no errors.";
        }
        return statement;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = scan.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zipCode = scan.nextLine();

        System.out.print("Enter the employee ID: ");
        String employeeID = scan.nextLine();

        validateInput(firstName, lastName, zipCode, employeeID);

        System.out.print(""+statement+"");
    }
}