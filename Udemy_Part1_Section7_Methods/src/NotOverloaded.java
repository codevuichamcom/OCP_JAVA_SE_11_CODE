/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic: Overloaded methods
*/

class NoLoad {
    public void bestMethod(int i) {
        System.out.println("bestMethod for int");
    }

//    private void bestMethod(int i) {
//        System.out.println("bestMethod for int");
//    }
//
//    public static void bestMethod(int i) {
//        System.out.println("bestMethod for int");
//    }
//
//    public void bestMethod(int myInteger) {
//        System.out.println("bestMethod for int");
//    }
//
//    public int bestMethod(int i) {
//        System.out.println("bestMethod for int");
//        return i;
//    }
}

public class NotOverloaded {
    public static void main(String[] args) {
        NoLoad n = new NoLoad();
        n.bestMethod(1);
    }

}