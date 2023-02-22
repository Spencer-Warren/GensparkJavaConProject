package com.javacon;

import java.util.List;

public class Main {
        public static void run() {
            List<SimpleEvent> events = new ParcingCon().getEvents();
            List<List<TimedEvent>> timedEvents = LogicCon.scheduleEvents(events);

            List<TimedEvent> track1 = timedEvents.get(0);
            List<TimedEvent> track2 = timedEvents.get(1);
            List<TimedEvent> track3 = timedEvents.get(2);
            List<TimedEvent> track4 = timedEvents.get(3);

            System.out.println("Track 1:");
            track1.forEach(System.out::println);
            System.out.println("12:00PM\tLunch");
            track2.forEach(System.out::println);
            System.out.println("05:00PM\tNetworking Event");
            System.out.println();
            System.out.println("Track 2:");
            track3.forEach(System.out::println);
            System.out.println("12:00PM\tLunch");
            track4.forEach(System.out::println);
            System.out.println("05:00PM\tNetworking Event");
        }

        public static void main(String[] args) {
            run();
        }
}
