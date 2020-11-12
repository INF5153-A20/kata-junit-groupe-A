package uutf;

public class TestResult {

    private final String name;
    private STATUS status;

    public TestResult(String name) {
        this.name = name;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "## " + status + " " + name;
    }
}
