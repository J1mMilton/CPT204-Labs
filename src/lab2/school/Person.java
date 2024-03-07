package lab2.school;

public class Person {

    private String name;
    private String address;
    private String phoneNum;
    private String email;


    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person" + " " + name;
    }

    public String getName() {
        return name;
    }


}
