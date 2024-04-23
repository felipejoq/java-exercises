package BuenasPracticas;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.addEmployee("John", 30);
        employeeManagement.addEmployee("Alice", 25);
        employeeManagement.removeEmployee(1);
        employeeManagement.printEmployeeList();
    }
}
