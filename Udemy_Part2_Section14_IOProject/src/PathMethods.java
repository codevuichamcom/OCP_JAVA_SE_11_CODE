/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 13:  I/O (Fundamentals and NIO2)
Topic: Path Manipulation methods
*/

import java.nio.file.Path;

public class PathMethods {
    public static void main(String[] args) {
        // Testing Path.normalize() method
        testNormalize();
        testRelativize();
    }

    // Normalizing a path, simplifies it.
    public static void testNormalize() {

        System.out.println("--- Results for the normalize() method ---");
        // Directory Structure shown below, -- represents a level
        // ---------------------
        // LearnProgrammingAcademy
        // -- ParallelStreams
        // -- IOProject
        // -- -- out
        // -- -- -- production
        // -- -- src
        Path p = Path.of("IOProject/../ParallelStreams");
        System.out.println("Normalize transforms \n\t" + p.toString()
                + "\n to: \n\t" + p.normalize() + "\n---------------");

        p = Path.of("out/production/IOProject/../../../src/.");
        System.out.println("Normalize transforms \n\t" + p.toString()
                + "\n to: \n\t" + p.normalize() + "\n---------------");

        p = Path.of("LearnProgrammingAcademy/IOProject/src/../../../.");
        System.out.println("Normalize transforms \n\t" + p.toString()
                + "\n to: \n\t" + p.normalize() + "\n---------------");

        p = Path.of("a/../../../b/./../c");
        System.out.println("Normalize transforms \n\t" + p.toString()
                + "\n to: \n\t" + p.normalize() + "\n---------------");

        p = Path.of("/a/../../../b/./../c");
        System.out.println("Normalize transforms \n\t" + p.toString()
                + "\n to: \n\t" + p.normalize() + "\n---------------");

    }

    // Testing the relativize method, accepts another Path as argument
    public static void testRelativize() {
        System.out.println("--- Results for the p1.relativize(p2) method ---");

        Path p1 = Path.of("LearningAcademyOrg/IOProject/out/production");
        Path p2 = Path.of("LearningAcademyOrg/ParallelStreams");

        // Relativize p1.relativize(p2)
        System.out.println("Relativize transforms \n\t"
                + p1.toString() + "\n\t" + p2.toString()
                + "\n to: \n\t" + p1.relativize(p2)
                + "\n---------------");

        // Relativize p2.relativize(p1)
        System.out.println("Relativize transforms \n\t"
                + p2.toString() + "\n\t" + p1.toString()
                + "\n to: \n\t" + p2.relativize(p1)
                + "\n---------------");

        p1 = Path.of("garden/fruit/apple");
        p2 = Path.of("pear");
        // Relativize p1.relativize(p2)
        System.out.println("Relativize transforms \n\t" +
                p1.toString() + "\n\t" + p2.toString()
                + "\n to: \n\t" + p1.relativize(p2) +
                "\n---------------");

        // Relativize p2.relativize(p1)
        System.out.println("Relativize transforms \n\t"
                + p2.toString() + "\n\t" + p1.toString()
                + "\n to: \n\t" + p2.relativize(p1) +
                "\n---------------");

        p1 = Path.of("/a/b");
        p2 = Path.of("a/b");
        try {
            // Relativize p1.relativize(p2)
            System.out.println("Relativize transforms \n\t" +
                    p1.toString() + "\n\t" + p2.toString()
                    + "\n to: \n\t" + p1.relativize(p2) +
                    "\n---------------");
        } catch (IllegalArgumentException ise) {
            System.out.println(ise);
        }
        try {
            // Relativize p2.relativize(p1)
            System.out.println("Relativize transforms \n\t" +
                    p2.toString() + "\n\t" + p1.toString()
                    + "\n to: \n\t" + p2.relativize(p1) +
                    "\n---------------");
        } catch (IllegalArgumentException ise) {
            System.out.println(ise);
        }
    }
}