/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeListRemoval {

    public static boolean delete(ArrayList<String> employees, String delname)
    {
        return employees.remove(delname);
    }


    public static void main(String[] args)
    {

        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.println("There are "+employees.size()+" employees: ");
        for (int i = 0; i < employees.size(); i++)
        {
            System.out.println(employees.get(i));
        }

        System.out.print("\nEnter an employee name to remove: ");
        Scanner scan = new Scanner(System.in);
        String delname = scan.nextLine();

        delete(employees, delname);

        System.out.println("\nThere are "+employees.size()+" employees:");
        for (int j = 0; j < employees.size(); j++)
        {
            System.out.println(employees.get(j));
        }
    }
}


