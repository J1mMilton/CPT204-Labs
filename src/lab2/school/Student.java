package lab2.school;

public class Student extends Person {

    private final String status = "Junior";

    public Student(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return "Student" + " " + super.getName();
    }


}
