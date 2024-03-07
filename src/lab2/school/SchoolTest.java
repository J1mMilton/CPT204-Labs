package lab2.school;

import org.junit.jupiter.api.Test;
import lab2.school.School.*;

public class SchoolTest {
    @Test
    public void simpleTest() {
        Person[] array = new Person[5];
        array[0] = new Person("Dutch");
        array[1] = new Student("Arthur");
        array[2] = new Employee("Hosea");
        array[3] = new Faculty("John");
        array[4] = new Staff("Sadie");

        for (Person person: array) {
            System.out.println(person);
        }
    }

}
