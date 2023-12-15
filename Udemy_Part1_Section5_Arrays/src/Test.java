import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] aArray = new int[3];
        Integer[] bArray = new Integer[3];
        aArray[2] = 1;
        Arrays.setAll(bArray,(i)->i*10);
//        Arrays.fill(bArray,10);
//        bArray[0] = 1;  // Line 1

        for (int a : aArray) {
            System.out.print(a + " ");
        }
        System.out.println("");
        for (int b : bArray) {  // Line 2
            System.out.print(b + " ");  // Line 3
        }


    }
}