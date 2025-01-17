package com.example.task02;

public class TimeSpan {
    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    void add(TimeSpan time) {
        hour += time.getHour();
        minute += time.getMinute();
        second += time.getSecond();
    }

    void subtract(TimeSpan time) {
        hour -= time.getHour();
        minute -= time.getMinute();
        second -= time.getSecond();
    }
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

}
