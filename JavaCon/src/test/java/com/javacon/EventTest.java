package src.test.java.com.javacon;

import src.main.java.com.javacon.Event;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class EventTest {

    @Test
    void getNameTest() {
        Event event = new Event("Event 1", 60);
        assertEquals("Event 1", event.getName());
    }

    @org.junit.jupiter.api.Test
    void getDurationTest() {
        Event event = new Event("Event 1", 60);
        assertEquals(60, event.getDuration());
    }

    @org.junit.jupiter.api.Test
    void testToStringTest1() {
        Event event = new Event("Event 1", 60);
        assertEquals("Event 1 60min", event.toString());
    }

    @org.junit.jupiter.api.Test
    void testToStringTest2() {
        Event event = new Event("Event 1", 5);
        assertEquals("Event 1 lightning", event.toString());
    }
}