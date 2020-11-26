package uutf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class TestFactory {



    public final Test scan(Class klass) {
        if( ! isTestClass(klass))
            throw new IllegalArgumentException(klass.getCanonicalName() + " must be a test class");
        return extractTests(klass);
    }

    private boolean isTestClass(Class klass) {
        return TestCase.class.isAssignableFrom(klass); // Warning (instance of)
    }

    private Test extractTests(Class klass) {
        TestSuite suite = new TestSuite();
        for (Method m: klass.getMethods()) {
            if(isTestMethod(m)) {
                try {
                    buildTestCase(suite, klass, m);
                } catch(Exception e) {
                    System.err.println(e); // Technical debt
                    continue;
                }
            }
        }
        return suite;
    }

    protected abstract boolean isTestMethod(Method m);

    private void buildTestCase(TestSuite suite, Class klass, Method m)
            throws NoSuchMethodException, IllegalAccessException,
            InstantiationException, InvocationTargetException {
        Object obj = klass.getDeclaredConstructor().newInstance();
        TestCase testCase = (TestCase) obj; // Warning (instance of / cast)
        suite.addCase(testCase.initialize(m.getName()));
    }


}
