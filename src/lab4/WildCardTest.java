package lab4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class WildCardTest {
    @Test
    public void printInteger(){
        ArrayList<Object> c = new ArrayList<>();
        c.add(3);
        c.add(4);
        c.add(12);
        WildCard.print(c);
    }
}
