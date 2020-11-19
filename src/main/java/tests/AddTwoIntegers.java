package tests;

import uutf.SingleTestCase;

import static uutf.Assertions.assertEquals;

public class AddTwoIntegers extends SingleTestCase {

    private int x,y = 0;

    @Override protected void setUp() {
        x = 1;
        y = 1;
    }

    @Override public void test() {
        assertEquals(2, x + y);
    }
}
