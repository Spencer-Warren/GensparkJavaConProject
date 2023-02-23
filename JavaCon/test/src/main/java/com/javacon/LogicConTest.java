package com.javacon;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LogicConTest {
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        outContent.reset();
        System.setOut(originalOut);
    }

    @Test
    void scheduleEventsTest() {
        List<SimpleEvent> events = new ArrayList<>();
        events.add(new SimpleEvent("Java and Containers -  Make it Awesome!", 45));
        events.add(new SimpleEvent("Java: Did you Know That?", 30));
        events.add(new SimpleEvent("Fun path to Java SE 11 Developer Certifications", 60));
        events.add(new SimpleEvent("Memory Efficient Java", 45));
        events.add(new SimpleEvent("Discover Modern Java", 45));
        events.add(new SimpleEvent("Ten Cool Things you might not know about the OpenJDK Java Virtual Machine", 30));
        events.add(new SimpleEvent("Effective Java SE 9 through 14 APIs/Lang features, makes your life easier.", 60));
        events.add(new SimpleEvent("This Aint Your Parents Java", 30));
        events.add(new SimpleEvent("Improving Startup for Java Analytical Workload", 60));
        events.add(new SimpleEvent("Human Readable Javascript", 30));
        events.add(new SimpleEvent("Vanilla.js: Modern 1st Party JavaScript", 30));
        events.add(new SimpleEvent("Property-Based Testing in Java", 30));
        events.add(new SimpleEvent("An Open Future for Java in the Cloud", 60));
        events.add(new SimpleEvent("Functional Programming in Java, Groovy, and Kotlin", 45));
        events.add(new SimpleEvent("10 Java Security Practices They Didn't Teach You In School", 45));
        events.add(new SimpleEvent("Future of Java Panel", 5));
        events.add(new SimpleEvent("Stretching the Service Mesh from Java to Beyond", 30));
        events.add(new SimpleEvent("Modern Java Clients with JavaFX: The Definitive Guide Keeping Up With Java: Look At All These New Features!", 45));
        events.add(new SimpleEvent("Keeping Up With Java: Look At All These New Features!", 60));

        List<List<TimedEvent>> result = LogicCon.scheduleEvents(events);

        assertEquals(4, result.size());
        List<TimedEvent> track1Morning = result.get(0);
        List<TimedEvent> track1Afternoon = result.get(1);
        List<TimedEvent> track2Morning = result.get(2);
        List<TimedEvent> track2Afternoon = result.get(3);

        assertTrue(LogicCon.getTotalDuration(track1Morning) <= 180);
        assertTrue(LogicCon.getTotalDuration(track1Afternoon) <= 240);
        assertTrue(LogicCon.getTotalDuration(track2Morning) <= 180);
        assertTrue(LogicCon.getTotalDuration(track2Afternoon) <= 240);
        assertFalse(outContent.toString().contains("Can't add"));
    }

    @Test
    void cantAddTest() {
        List<SimpleEvent> events = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            events.add(new SimpleEvent("Event 1", 60));
        }
        LogicCon.scheduleEvents(events);
        assertTrue(outContent.toString().contains("Can't add"));
    }

}