package Practices.officehour_oop;

public class Employee {
    private String name;
    private Long employeeId;

    public void setName(String name) {
        if(name.contains(" ")){
            System.out.println("it is wrong");
            return;//mean go outside the method
        }
        this.name = name;
    }

    public void setEmployeeId(Long employeeId) {

        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public Employee(String name, Long employeeId) {
        setName(name);
        setEmployeeId(employeeId);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
