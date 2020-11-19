package tests;

import uutf.TestCase;
import uutf.TestSuite;

import static uutf.Assertions.assertEquals;

public class IntegerTests extends TestSuite {

    public IntegerTests() {
        this.addCase(new AddIntegers());
        this.addCase(new SubIntegers());
        this.addCase(new ThrowAnException());

    }

    private static class AddIntegers extends TestCase {
        @Override
        protected void test() {
            int x = 1;
            int y=1;
            assertEquals(2, x + y);
        }
    }

    private static class SubIntegers extends TestCase {
        @Override
        protected void test() {
            int x = 1;
            int y=1;
            assertEquals(2, x - y);
        }
    }

    private static class ThrowAnException extends TestCase {
        @Override
        protected void test() {
            throw new RuntimeException("pouet");
        }
    }

}
