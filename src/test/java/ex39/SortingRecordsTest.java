/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex39;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class SortingRecordsTest {


    @Test
    void employeelistcreate() {

        ArrayList<SortingRecords.Employee> employeeList1 = new ArrayList<>();
        ArrayList<SortingRecords.Employee> employeeList = new ArrayList<>();

        employeeList1.add(new SortingRecords.Employee("John", "Johnson", "Manager", "2016-12-31"));
        employeeList1.add(new SortingRecords.Employee("Tou", "Xiong", "Software Engineer", "2016-120-05"));
        employeeList1.add(new SortingRecords.Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList1.add(new SortingRecords.Employee("Jake", "Jacobson", "Programmer", ""));
        employeeList1.add(new SortingRecords.Employee("Jacquelyn", "Jackson", "DBA", ""));
        employeeList1.add(new SortingRecords.Employee("Sally", "Webber", "Web Developer", "2015-12-18"));


        SortingRecords.employeelistcreate(employeeList);

        assertEquals(employeeList1.size(), employeeList.size());


    }
}