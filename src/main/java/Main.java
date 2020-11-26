import tests.*;
import uutf.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Démo JUNIT");

        TestRunner runner = new TestRunner();
        TestFactory scanner = new TestFactoryMethod();
        runner.runAndPrint(scanner.scan(IntegerTests.class));

        TestFactory scanner2 = new TestFactoryAnnotation();
        runner.runAndPrint(scanner2.scan(IntegerTestsAnnotations.class));

        System.out.println("Démo Single Test");
        runner = new TestRunner();
        TestCase t = new AddTwoIntegers();
        t.initialize("pouet");
        runner.runAndPrint(t);

    }

}
