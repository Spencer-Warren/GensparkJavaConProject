package com.javacon;

/**
 * Represents an event
 */
public class Event {
    public final String name; // name of the event
    public final int duration; // in minutes

    /**
     * Constructor
     *
     * @param name     name of the event
     * @param duration duration of the event in minutes
     */
    public Event(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    /**
     * Returns the name of the event
     *
     * @return the name of the event
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the duration of the event
     *
     * @return the duration of the event
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Returns a string representation of the event
     * if the duration is 5 minutes, it is a lightning talk
     *
     * @return a string representation of the event
     */
    public String toString() {
        if (duration == 5) {
            return String.format("%s lightning", name);
        }
        return String.format("%s %dmin", name, duration);
    }
}
