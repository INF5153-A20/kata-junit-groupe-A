package uutf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ResultCollector {

    private Set<TestResult> results = new HashSet<>();
    public void addResult(TestResult tr) { results.add(tr); }

    @Override
    public String toString() {
        Map<STATUS, Integer> counters = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for(TestResult tr: results) {
            builder.append(tr).append("\n");
            counters.put(tr.getStatus(),
                    1+ counters.getOrDefault(tr.getStatus(),0));
        }
        builder.append(counters).append("\n");
        return builder.toString();
    }
}
