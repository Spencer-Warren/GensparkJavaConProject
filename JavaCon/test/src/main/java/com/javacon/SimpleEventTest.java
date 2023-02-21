package com.javacon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleEventTest {

    @Test
    void getNameTest() {
        SimpleEvent simpleEvent = new SimpleEvent("Event 1", 60);
        assertEquals("Event 1", simpleEvent.getName());
    }

    @org.junit.jupiter.api.Test
    void getDurationTest() {
        SimpleEvent simpleEvent = new SimpleEvent("Event 1", 60);
        assertEquals(60, simpleEvent.getDuration());
    }

    @org.junit.jupiter.api.Test
    void testToStringTest1() {
        SimpleEvent simpleEvent = new SimpleEvent("Event 1", 60);
        assertEquals("Event 1 60min", simpleEvent.toString());
    }

    @org.junit.jupiter.api.Test
    void testToStringTest2() {
        SimpleEvent simpleEvent = new SimpleEvent("Event 1", 5);
        assertEquals("Event 1 lightning", simpleEvent.toString());
    }
}