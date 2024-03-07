package lab2.school;

public class Faculty extends Employee {

    private String officeHours;
    private String rank;

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty" + " " + super.getName();
    }

}
