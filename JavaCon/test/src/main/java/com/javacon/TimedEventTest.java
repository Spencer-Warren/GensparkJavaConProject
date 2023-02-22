package com.javacon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimedEventTest {

    @Test
    void getStartTimeTest() {
        TimedEvent timedEvent = new TimedEvent("Event 1", 60, 540);
        assertEquals(540, timedEvent.getStartTime());
    }

    @Test
    void toStringTest(){
        TimedEvent timedEvent1 = new TimedEvent("Event 1", 60, 540);
        TimedEvent timedEvent2 = new TimedEvent("Event 2", 5, 545);
        TimedEvent timedEvent3 = new TimedEvent("Event 3", 45, 780);
        TimedEvent timedEvent4 = new TimedEvent("Event 4", 30, 600);
        assertEquals("09:00AM\tEvent 1\t60min", timedEvent1.toString());
        assertEquals("09:05AM\tEvent 2\tlightning", timedEvent2.toString());
        assertEquals("01:00PM\tEvent 3\t45min", timedEvent3.toString());
        assertEquals("10:00AM\tEvent 4\t30min", timedEvent4.toString());
    }
}