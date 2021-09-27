/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Thach Vo
 */


package ex40;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FilteringRecordsTest {

    @Test
    void employeelistcreate() {

        ArrayList<FilteringRecords.Employee> employeeList = new ArrayList<>();
        ArrayList<FilteringRecords.Employee> employeeList1 = new ArrayList<>();

        employeeList1.add(new FilteringRecords.Employee("John", "Johnson", "Manager", "2016-12-31"));
        employeeList1.add(new FilteringRecords.Employee("Tou", "Xiong", "Software Engineer", "2016-120-05"));
        employeeList1.add(new FilteringRecords.Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList1.add(new FilteringRecords.Employee("Jake", "Jacobson", "Programmer", ""));
        employeeList1.add(new FilteringRecords.Employee("Jacquelyn", "Jackson", "DBA", ""));
        employeeList1.add(new FilteringRecords.Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

        FilteringRecords.employeelistcreate(employeeList);

        assertEquals(employeeList.size(), employeeList1.size());


    }
}