package com.javacon;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ParcingCon Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Feb 20, 2023</pre>
 */
public class ParcingConTest {

    /**
     * Method: getEvents()
     */
    @Test
    public void testGetEvents() {

        List<SimpleEvent> eventList = new ArrayList<>();
        eventList = ParcingCon.getEvents("resources/input.txt");
        List<SimpleEvent> events = new ArrayList<>();
        events.add(new SimpleEvent("Java and Containers -  Make it Awesome!", 45));
        events.add(new SimpleEvent("Java: Did you Know That?", 30));
        events.add(new SimpleEvent("Fun path to Java SE 11 Developer Certifications", 60));
        events.add(new SimpleEvent("Memory Efficient Java", 45));
        events.add(new SimpleEvent("Discover Modern Java", 45));
        events.add(new SimpleEvent("Ten Cool Things you might not know about the OpenJDK Java Virtual Machine", 30));
        events.add(new SimpleEvent("Effective Java SE 9 through 14 APIs/Lang features, makes your life easier.", 60));
        events.add(new SimpleEvent("This Ain\\u2019t Your Parents Java", 30));
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
        assertEquals(eventList, events);
    }
}
