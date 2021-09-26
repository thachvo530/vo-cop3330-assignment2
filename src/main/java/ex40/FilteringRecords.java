/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */

package ex40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FilteringRecords {

    static class Employee {
        public String firstName;
        public String lastName;
        public String position;
        public String sepDate;


        public Employee(String firstName, String lastName, String position, String sepDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.position = position;
            this.sepDate = sepDate;
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();
        String lastName = "";

        employeelistcreate(employeeList);

        System.out.print("Enter a search string: ");
        String search = scan.nextLine();

        System.out.println("Name \t\t | Position \t | Separation Date");
        System.out.println("-----------------------------------------------");

        comparelastName(lastName, employeeList);

        filter(employeeList, search);

    }

    public static void filter(ArrayList<Employee> employeeList, String search)
    {
        for (Employee employee : employeeList)
        {
            if(employee.firstName.contains(search) || employee.lastName.contains(search))
                System.out.printf("%s %s | %s | %s \n", employee.firstName, employee.lastName, employee.position, employee.sepDate);
        }
    }

    public static void comparelastName(String lastName, ArrayList<Employee> employeeList) {
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return String.valueOf(e1.lastName).compareTo(e2.lastName);
            }
        });
    }




    public static ArrayList<Employee> employeelistcreate(ArrayList<Employee> employeeList)
    {
        employeeList.add(new Employee("John", "Johnson", "Manager", "2016-12-31"));
        employeeList.add(new Employee("Tou", "Xiong", "Software Engineer", "2016-120-05"));
        employeeList.add(new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(new Employee("Jake", "Jacobson", "Programmer", ""));
        employeeList.add(new Employee("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

        return employeeList;
    }
}