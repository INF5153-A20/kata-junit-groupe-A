package tests;

import uutf.TestCase;

import static uutf.Assertions.assertEquals;

public class SubIntegers extends TestCase {
    @Override
    protected void test() {
        int x = 1;
        int y=1;
        assertEquals(2, x - y);
    }
}
