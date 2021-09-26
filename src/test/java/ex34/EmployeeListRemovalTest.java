package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListRemovalTest {

    @Test
    void delete() {

        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        assertTrue(EmployeeListRemoval.delete(employees, "John Smith"));
        assertTrue(EmployeeListRemoval.delete(employees, "Jackie Jackson"));
        assertTrue(EmployeeListRemoval.delete(employees, "Chris Jones"));
        assertTrue(EmployeeListRemoval.delete(employees, "Amanda Cullen"));
        assertTrue(EmployeeListRemoval.delete(employees, "Jeremy Goodwin"));

    }
}