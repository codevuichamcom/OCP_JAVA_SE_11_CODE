import java.io.IOException;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 11: Handling Exception
Topic:  Exceptions, Out of Ordingary
Sub-Topic:  Exceptions in Initializers
*/
class StaticTest {
    public static String currentMessage;

    // Initialized to 0
    public static int currentVal;

    // Static Initializer
    static {
        System.out.println("Initializing class StaticTest");
        try {
            // We force an error for demonstration purposes
            if ((10 / currentVal) > 0) {
                System.out.println("Whoops");
            }
        } catch (Exception e) {
            System.out.println("Caught the error");
        } finally {
            currentVal = 1;
        }
        currentMessage = "Inside Static Initializer";
    }
}

public class InitializerExceptions {
    // Create an instance initializer block that throws an unchecked exception
    {
            int i = 0;
            if (i == 0) throw new RuntimeException("Whoops");
    }

    // Constructor declares IOException in a throws clause
    InitializerExceptions() throws IOException {

    }
    public static void main(String[] args) {
        System.out.println("Executing main()");
        try {
            System.out.println(StaticTest.currentMessage);
        } catch (Exception e) {
            StaticTest.currentVal = 1;
            System.out.println(StaticTest.currentMessage);
        }

    }
}