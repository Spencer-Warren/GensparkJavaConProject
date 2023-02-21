package com.javacon;

public class TimedEvent extends SimpleEvent {
    // start time of the event in minutes
    // 9:00 AM is 540 minutes

    private final int startTime;

    public TimedEvent(String name, int duration, int startTime) {
        super(name, duration);
        this.startTime = startTime;
    }

    public int getStartTime() {
        return startTime;
    }
}
