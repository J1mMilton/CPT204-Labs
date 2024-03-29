package lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymbolGroupingTest {
    @Test
    public void testCase1() {
        String str = "int a = (int)(\"0.1\");";
        Assertions.assertEquals("Paired", SymbolGrouping.group(str));
    }

    @Test
    public void testCase2() {
        String str = "public void static main(String[] args){";
        Assertions.assertEquals("Unpaired", SymbolGrouping.group(str));
    }


    @Test
    public void testInverse() {
        String str = ")(";
        Assertions.assertEquals("Unpaired", SymbolGrouping.group(str));
    }
    @Test
    public void testIntersection() {
        String str = "([)]";
        Assertions.assertEquals("Unpaired", SymbolGrouping.group(str));
    }

    @Test
    public void emptyTest() {
        String str = "";
        Assertions.assertEquals("Paired", SymbolGrouping.group(str));
    }
}
