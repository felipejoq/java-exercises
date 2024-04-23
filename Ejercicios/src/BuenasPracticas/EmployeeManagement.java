package BuenasPracticas;

import java.util.ArrayList;

public class EmployeeManagement {
    private ArrayList<Employee> employees;

    public EmployeeManagement() {
        employees = new ArrayList<>();
    }

    public void addEmployee(String name, int age) {
        Employee employee = new Employee(name, age);
        employees.add(employee);
    }

    public void removeEmployee(int i) {
        employees.remove(i);
    }

    public void printEmployeeList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}