package uutf;

import tests.AddIntegers;

import java.util.*;

public class TestRunner {

    private Set<TestCase> cases = new HashSet<>();



    public void run() {
        Map<STATUS, Integer> counters = new HashMap<>();
        Set<TestResult> results = new HashSet<>();
        for(TestCase test: cases) {
            TestResult res = test.run();
            counters.put(res.getStatus(),
                    1+ counters.getOrDefault(res.getStatus(),0));
            results.add(res);
        }
        results.forEach(System.out::println);
        System.out.println(counters);
    }

    public void add(TestCase aCase) {
        cases.add(aCase);
    }
}
