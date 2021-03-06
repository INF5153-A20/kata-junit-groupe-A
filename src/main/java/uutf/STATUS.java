package uutf;

public enum STATUS {

    PASSED('X'),
    FAILED(' '),
    ERRORED('!');

    private final char symbol;

    STATUS(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "["+symbol+"]";
    }

}
