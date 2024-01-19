public final class OutsideTest {        // Line 1

    private static int myInteger = 1;

    public static class InsideTest {
        private int myInteger = OutsideTest.myInteger++;  // Line 2
    }

    public static void main(String[] args) {
        OutsideTest ot = new OutsideTest();
        OutsideTest.InsideTest it = new InsideTest();  // Line 3
        System.out.println(ot.myInteger + " " + it.myInteger);  // Line 4
    }
}