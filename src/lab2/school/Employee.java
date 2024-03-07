package lab2.school;

import java.time.LocalDate;

public class Employee extends Person {
    private String office;
    private String salary;
    private LocalDate dateHired;

    public Employee(String name) {
        super(name);
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee" + " " + super.getName();
    }

}
