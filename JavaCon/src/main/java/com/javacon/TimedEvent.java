package com.javacon;

public class TimedEvent extends SimpleEvent {
    // start time of the event in minutes
    // 9:00 AM is 540 minutes

    private final int startTime;

    public TimedEvent(SimpleEvent event, int startTime) {
        super(event.getName(), event.getDuration());
        this.startTime = startTime;
    }

    public TimedEvent(String name, int duration, int startTime) {
        super(name, duration);
        this.startTime = startTime;
    }

    public int getStartTime() {
        return startTime;
    }

    @Override
    public String toString(){
        String ans = "";
        if(startTime / 60 > 12){
            ans = "0" + ((startTime / 60) - 12) + ":";
            if(startTime % 60 < 10){
                ans = ans + "0" + (startTime % 60);
            } else{
                ans = ans + (startTime % 60);
            }
            ans = ans + "PM\t" + name + "\t";
        } else if(startTime / 60 < 10){
            ans = "0" + (startTime / 60) + ":";
            if(startTime % 60 < 10){
                ans = ans + "0" + (startTime % 60);
            } else{
                ans = ans + (startTime % 60);
            }
            ans = ans + "AM\t" + name + "\t";
        } else{
            ans = (startTime / 60) + ":";
            if(startTime % 60 < 10){
                ans = ans + "0" + (startTime % 60);
            } else{
                ans = ans + (startTime % 60);
            }
            ans = ans + "AM\t" + name + "\t";
        }
        if(duration == 5){
            ans = ans + "lightning";
        } else{
            ans = ans + duration + "min";
        }
        return ans;
    }

}
