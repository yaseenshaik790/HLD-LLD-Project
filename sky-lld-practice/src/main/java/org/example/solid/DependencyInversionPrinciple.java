package org.example.solid;

// The Object should not tightly coupled. It should be alwasy loosely coupled with other objects

//NO

/*class Employee{
    private Integer id;
    private String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}

class EmployeeService{

    private Employee employee = new Employee(1, "Yaseen");

    public EmployeeService(){
        this.employee = employee;
    }

}*/

class Employee{
    private Integer id;
    private String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}

class EmployeeService{
    private Employee employee;

    public EmployeeService(Employee employee){
        this.employee = employee;
    }

}

public class DependencyInversionPrinciple {

}
