package com.javacon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private static final PrintStream originalOut = System.out;
    private static ByteArrayOutputStream baos;

    @BeforeEach
    void setUp() {
        baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
    }

    @AfterEach
    void tearDown() {
        // Restore System.in
        System.setOut(originalOut);
    }

    @Test
    void runTest() {
        Main.main(new String[]{}); // Run the main method
        String output = baos.toString();
        String expectedOutput = String.format("Track 1:%n" +
                "09:00AM\tFunctional Programming in Java, Groovy, and Kotlin\t45min%n" +
                "09:45AM\t10 Java Security Practices They Didn't Teach You In School\t45min%n" +
                "10:30AM\tModern Java Clients with JavaFX: The Definitive Guide Keeping Up With Java: Look At All These New Features!\t45min%n" +
                "11:15AM\tJava: Did you Know That?\t30min%n" +
                "12:00PM\tLunch%n" +
                "01:00PM\tFun path to Java SE 11 Developer Certifications\t60min%n" +
                "02:00PM\tEffective Java SE 9 through 14 APIs/Lang features, makes your life easier.\t60min%n" +
                "03:00PM\tImproving Startup for Java Analytical Workload\t60min%n" +
                "04:00PM\tJava and Containers -  Make it Awesome!\t45min%n" +
                "04:45PM\tFuture of Java Panel\tlightning%n" +
                "05:00PM\tNetworking Event%n" +
                "%n" +
                "Track 2:%n" +
                "09:00AM\tTen Cool Things you might not know about the OpenJDK Java Virtual Machine\t30min%n" +
                "09:30AM\tThis Ain\\u2019t Your Parents Java\t30min%n" +
                "10:00AM\tHuman Readable Javascript\t30min%n" +
                "10:30AM\tVanilla.js: Modern 1st Party JavaScript\t30min%n" +
                "11:00AM\tProperty-Based Testing in Java\t30min%n" +
                "11:30AM\tStretching the Service Mesh from Java to Beyond\t30min%n" +
                "12:00PM\tLunch%n" +
                "01:00PM\tAn Open Future for Java in the Cloud\t60min%n" +
                "02:00PM\tKeeping Up With Java: Look At All These New Features!\t60min%n" +
                "03:00PM\tMemory Efficient Java\t45min%n" +
                "03:45PM\tDiscover Modern Java\t45min%n" +
                "05:00PM\tNetworking Event%n");
        assertEquals(expectedOutput, output);
    }
}