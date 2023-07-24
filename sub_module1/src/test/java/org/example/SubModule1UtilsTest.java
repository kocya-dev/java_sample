package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class SubModule1UtilsTest extends TestCase {
    @Test
    public void testMultiply(){
        assertEquals(2, SubModule1Utils.Multiply(1, 2));
    }

    @Test
    public void testfamilyService() {
        assertEquals("a", TestMethods.familyService(Arrays.stream(new String[]{"aaa"}).toList()));
    }
    @Test
    public void familyMultiLogic() {
        assertEquals(30, TestMethods.familyMultiLogic(10, 3));
    }
}