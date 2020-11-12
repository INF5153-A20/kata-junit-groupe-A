import static uutf.Assertions.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Démo JUNIT");
        try {
            System.out.println("Test case: AddIntegers");
            int x = 1;
            int y=1;
            assertEquals(2, x + y);
            System.out.println("SUCCESS!");
        } catch(AssertionError ae) {
            System.out.println("FAILED!");
        }

        try {
            System.out.println("Test case: SubIntegers");
            int x = 1;
            int y=1;
            assertEquals(2, x - y);
            System.out.println("SUCCESS!");
        } catch(AssertionError ae) {
            System.out.println("FAILED!");
        }

    }

}
