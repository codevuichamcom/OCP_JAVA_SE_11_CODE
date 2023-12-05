/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Testing import statements
*/

// A single-type-import declaration
//import garden.vegetable.VineVegetable;

import garden.*; //Only class and interface directly , not in child package

// type-import-on-demand declaration
import garden.vegetable.*;
import nursery.vegetable.*;

public class TestImport {
    public static void main(String[] args) {

        // String class in the java.lang package, simple class name ok
        // no import statement required
        String s = "We are testing import statements";
        System.out.println(s);

        // We use simple name because we specified location in the import
        // statement
        VineVegetable.main(args);

        //If you want to use two class same name -> use FQCN
        nursery.vegetable.VineVegetable.main(args);

        VegetableInGarden.main(args);
    }
}
class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local VineVegetable");
    }
}