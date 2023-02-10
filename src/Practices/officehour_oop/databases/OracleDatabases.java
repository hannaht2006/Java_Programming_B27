package Practices.officehour_oop.databases;

import Practices.officehour_oop.DatabaseService;
import Practices.officehour_oop.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OracleDatabases implements DatabaseService {
    List<Employee> oracleDatabaseEmployee = new ArrayList<>();


    @Override
    public void addEmployee(Employee employee) {
     oracleDatabaseEmployee.add(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
    oracleDatabaseEmployee.removeIf(emp -> emp.getEmployeeId()==id);
    }

    @Override
    public Employee getEmployee(Long id) {
        for(Employee employee :oracleDatabaseEmployee ){
            if(employee.getEmployeeId()==id){
                return employee;

            }
        }
        System.out.println("in database there is no this record");

        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return oracleDatabaseEmployee;
    }

    @Override
    public List<String> getAllEmployeeNames() {
     List<String> names = new ArrayList<>();
     for (Employee eachEmployee : oracleDatabaseEmployee){
         names.add(eachEmployee.getName());
     }
       return names;
    }

    @Override
    public List<String> getUniqueEmployeeNames() {
        Set<String> uniqueNames = new HashSet<>(getAllEmployeeNames());

        return new ArrayList(uniqueNames);//can not return Set type --> convert back to ArrayList to return
    }
}
