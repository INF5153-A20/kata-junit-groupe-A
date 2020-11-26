package uutf;

import java.lang.reflect.Method;

public class TestFactoryMethod extends TestFactory {

    private static final String TEST_NAME_PREFIX = "test_";

    @Override
    protected boolean isTestMethod(Method m) {
        return m.getName().startsWith(TEST_NAME_PREFIX);
    }
}
