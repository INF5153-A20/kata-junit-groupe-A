import tests.*;
import uutf.TestRunner;

import static uutf.Assertions.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Démo JUNIT");

        TestRunner runner = new TestRunner();

        runner.add(new AddIntegers());
        runner.add(new SubIntegers());
        runner.add(new ThrowAnException());

        runner.run();
    }

}
