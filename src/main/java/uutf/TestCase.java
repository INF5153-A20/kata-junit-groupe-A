package uutf;


public abstract  class  TestCase implements Test {

    @Override
    public final void run(ResultCollector collector) {
        TestResult result = new TestResult(this.getClass().getCanonicalName());
        try {
            test();
            result.setStatus(STATUS.PASSED);
        } catch(AssertionError ae) {
            result.setStatus(STATUS.FAILED);
        } catch (Exception e) {
            result.setStatus(STATUS.ERRORED);
        }
        collector.addResult(result);
    }

    protected abstract void test(); // Template Method

}
