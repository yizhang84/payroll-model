package org.yi;

import org.yi.model.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee employee = new Employee(1L, "stanley","chief");
        System.out.println("main employee: "+ employee);
    }
}