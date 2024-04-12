package lab7;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class hashSetMethodTest {
    @Test
    public void nonDuplicatedSet() {
        Set<Person> set1 = new HashSet<>();
        set1.add(new Person("John",19));
        set1.add(new Person("Mary",20));
        set1.add(new Person("John",19));
        System.out.println(set1);
    }
}
