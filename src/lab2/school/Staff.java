package lab2.school;

public class Staff extends Employee {

    private String title;

    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff" + " " + super.getName();
    }

}
