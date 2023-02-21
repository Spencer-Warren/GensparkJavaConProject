package com.javacon;

import java.util.ArrayList;
import java.util.List;

public class LogicCon {

    private LogicCon() {
    }

    /**
     * Schedules the events
     *
     * @param events the list of events to schedule
     * @return the list of scheduled events
     */
    public static List<TimedEvent> scheduleEvents(List<SimpleEvent> events) {
        List<TimedEvent> scheduledEvents = new ArrayList<>();

        TimedEvent lunch = new TimedEvent("Lunch", 60, 12 * 60);
        TimedEvent networking = new TimedEvent("Networking", 60, 17 * 60);

        for (SimpleEvent event : events) {
            // schedule the event
        }
        return scheduledEvents;
    }
}
