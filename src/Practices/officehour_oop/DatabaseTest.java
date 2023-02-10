package Practices.officehour_oop;

import Practices.officehour_oop.databases.OracleDatabases;

import java.util.List;

public class DatabaseTest {
    public static void main(String[] args) {
        DatabaseService oracleDatabase = new OracleDatabases();
        //add employee into database
        Employee employee1 = new Employee("Adam", 1L);
        oracleDatabase.addEmployee(employee1);
        //get the employee
        List<Employee> employees = oracleDatabase.getEmployees();
        System.out.println(employees);
        //add more employee
        Employee employee2 = new Employee("Aaron", 2L);
        oracleDatabase.addEmployee(employee2);
        //get all employees
        System.out.println(oracleDatabase.getEmployees());
        //get single employee id 2L
        System.out.println(oracleDatabase.getEmployee(2L));
        //delete employee id 1L
        oracleDatabase.deleteEmployee(1L);
        //get all employee
        System.out.println(oracleDatabase.getEmployees());

    }
}
