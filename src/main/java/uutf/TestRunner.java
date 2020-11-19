package uutf;

public class TestRunner {

    public ResultCollector run(Test t) {
        ResultCollector collector = new ResultCollector();
        t.run(collector);
        return collector;
    }

    public void runAndPrint(Test t) {
        System.out.println(run(t));
    }

}
