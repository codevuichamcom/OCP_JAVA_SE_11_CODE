public class IsEmptyAndIsBlankComparative {
    public static void main(String[] args) {
        String s1 = "       ";
        System.out.println("s1 isEmpty: "+s1.isEmpty()); // false
        System.out.println("s1 isBlank: "+s1.isBlank()); // true

        String s2 = "";
        System.out.println("s2 isEmpty: "+s2.isEmpty()); // true
        System.out.println("s2 isBlank: "+s2.isBlank()); // true
    }
}
