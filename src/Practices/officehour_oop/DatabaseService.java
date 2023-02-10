package Practices.officehour_oop;

import java.util.List;

public interface DatabaseService {

    void addEmployee(Employee employee);//first rule between classes: implement the method
    void deleteEmployee(Long id); // second rule between classes
    Employee getEmployee(Long id);// third rule
    List<Employee> getEmployees();
    List<String>getAllEmployeeNames();
    List<String>getUniqueEmployeeNames();

}
