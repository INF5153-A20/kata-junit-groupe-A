package uutf;

import java.util.HashSet;
import java.util.Set;

public class TestSuite implements Test {

    private Set<Test> cases = new HashSet<>();
    public void addCase(Test t) { cases.add(t); }


    @Override
    public void run(ResultCollector collector) {
        for(Test t: cases) {
            t.run(collector);
        }
    }
}
