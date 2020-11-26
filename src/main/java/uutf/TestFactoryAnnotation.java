package uutf;

import java.lang.reflect.Method;

public class TestFactoryAnnotation extends TestFactory {
    @Override
    protected boolean isTestMethod(Method m) {
        return (null != m.getDeclaredAnnotation(TestMethod.class));
    }
}
