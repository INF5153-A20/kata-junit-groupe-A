package uutf;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract  class  TestCase implements Test {

    private String testMethodName;
    public TestCase initialize(String testMethodName) {
        this.testMethodName = testMethodName;
        return this;
    }

    @Override
    public final void run(ResultCollector collector) {
        TestResult result =
                new TestResult(this.getClass().getCanonicalName() + "::" + testMethodName);
        try {
            setUp();
            executeTestMethod();
            result.setStatus(STATUS.PASSED);
        } catch (InvocationTargetException ite) {
            try {
                throw ite.getTargetException();
            } catch (AssertionError ae) {
                result.setStatus(STATUS.FAILED);
            } catch (Throwable e) {
                result.setStatus(STATUS.ERRORED);
            }
        } catch (IllegalAccessException | NoSuchMethodException e) {
            result.setStatus(STATUS.ERRORED);
        } finally {
            tearDown();
        }
        collector.addResult(result);
    }

    private void executeTestMethod()
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {
        Method m = this.getClass().getMethod(testMethodName);
        m.invoke(this); // this."maméthodequejeconnaispas"();
    }

    protected void setUp() { };     // Template Method

    protected void tearDown() { };  // Template Method
}
