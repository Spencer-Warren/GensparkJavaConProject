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
    public static List<List<TimedEvent>> scheduleEvents(List<SimpleEvent> events) {
        events.sort((e1, e2) -> e2.duration - e1.duration);

        List<TimedEvent> track1Morning = new ArrayList<>();
        List<TimedEvent> track1Afternoon = new ArrayList<>();
        List<TimedEvent> track2Morning = new ArrayList<>();
        List<TimedEvent> track2Afternoon = new ArrayList<>();

        for (SimpleEvent event : events) {
            if (canAddAfternoon(track1Afternoon, event)) {
                track1Afternoon.add(new TimedEvent(event, 13 * 60 + getTotalDuration(track1Afternoon)));
            } else if (canAddAfternoon(track2Afternoon, event)) {
                track2Afternoon.add(new TimedEvent(event, 13 * 60 + getTotalDuration(track2Afternoon)));
            } else if (canAdd(track1Morning, event)) {
                track1Morning.add(new TimedEvent(event, 9 * 60 + getTotalDuration(track1Morning)));
            } else if (canAdd(track2Morning, event)) {
                track2Morning.add(new TimedEvent(event, 9 * 60 + getTotalDuration(track2Morning)));
            } else {
                System.out.println("Can't add " + event);
            }
        }
        return List.of(track1Morning, track1Afternoon, track2Morning, track2Afternoon);
    }

    /**
     * Checks if the event can be added to the block
     *
     * @param block the block of events
     * @param event the event to add
     * @return true if the event can be added to the block
     */
    private static boolean canAdd(List<TimedEvent> block, SimpleEvent event) {
        return getTotalDuration(block) + event.getDuration() <= 180;
    }

    /**
     * Checks if the event can be added to the block
     * in the afternoon session since it has a different duration
     *
     * @param block the block of events
     * @param event the event to add
     * @return true if the event can be added to the block
     */
    private static boolean canAddAfternoon(List<TimedEvent> block, SimpleEvent event) {
        return getTotalDuration(block) + event.getDuration() < 240;
    }


    /**
     * Gets the total duration of the events
     *
     * @param events the list of events
     * @return the total duration of the events
     */
    public static int getTotalDuration(List<TimedEvent> events) {
        int totalDuration = 0;
        for (SimpleEvent event : events) {
            totalDuration += event.getDuration();
        }
        return totalDuration;
    }
}
