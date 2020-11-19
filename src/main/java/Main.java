import tests.*;
import uutf.TestCase;
import uutf.TestRunner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Démo JUNIT");

        TestRunner runner = new TestRunner();
        runner.runAndPrint(IntegerTests.build());

        System.out.println("Démo Single Test");
        runner = new TestRunner();
        TestCase t = new AddTwoIntegers();
        t.initialize("pouet");
        runner.runAndPrint(t);

    }

}
