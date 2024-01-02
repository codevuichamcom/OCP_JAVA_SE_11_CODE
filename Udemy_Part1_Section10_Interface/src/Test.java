interface ITest {
    void myMethod();
}
abstract class ATest implements ITest {
    public abstract void myMethod(); // Line 1
}

public class Test extends ATest {
    public static void main(String[] args) {
        Test t = new Test();
        t.myMethod();
    }

    public void myMethod() {   // Line 2
        System.out.println("Success");
    }
}