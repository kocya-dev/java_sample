package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SubModule2UtilsTest extends TestCase {
    @Test
    public void testMultiply(){
        assertEquals(2, SubModule2Utils.Multiply(1, 2));
    }
}