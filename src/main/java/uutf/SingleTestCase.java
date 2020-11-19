package uutf;

public abstract class SingleTestCase extends TestCase {

    private static final String DEFAULT_METHOD_NAME = "test";

    public SingleTestCase() { this.initialize(DEFAULT_METHOD_NAME); }

    public abstract void test();

}
