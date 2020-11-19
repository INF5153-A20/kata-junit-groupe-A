import tests.*;
import uutf.TestRunner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Démo JUNIT");

        TestRunner runner = new TestRunner();

        runner.runAndPrint(new IntegerTests());

    }

}
