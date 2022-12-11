package oop.lesson7.task;

public class TimeInterval {
    private int hour;
    private int minute;
    private int second;

    public TimeInterval(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeInterval(int totalSeconds) {
        this.hour = totalSeconds / 3600;
        this.minute = (totalSeconds % 3600) / 60;
        this.second = (totalSeconds % 3600) % 60;
    }

    public int secondFinder(TimeInterval timeInterval) {
        int secondCounter = (timeInterval.getHour() * 60 * 60) + (timeInterval.getMinute() * 60) + timeInterval.getSecond();
        return secondCounter;
    }

    public void currentTime() {
        System.out.println(hour + ":" + minute + ":" + second);
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
}
