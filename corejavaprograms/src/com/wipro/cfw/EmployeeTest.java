package com.wipro.cfw;

import java.util.TreeSet;

public class EmployeeTest {
    
    public static void main(String[] args) {
        TreeSet<Employee> empSet = new TreeSet<>(new EmployeeNameComparator());

        Employee emp1 = new Employee(11, "Niki");
        Employee emp2 = new Employee(12, "Aish");

        empSet.add(emp1);
        empSet.add(emp2);

        for (Object obj : empSet) {
            System.out.println(obj);
        }
    }
}
