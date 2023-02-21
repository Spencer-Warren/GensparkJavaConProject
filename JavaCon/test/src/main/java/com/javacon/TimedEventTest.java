package com.javacon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimedEventTest {

    @Test
    void getStartTimeTest() {
        TimedEvent timedEvent = new TimedEvent("Event 1", 60, 540);
        assertEquals(540, timedEvent.getStartTime());
    }
}