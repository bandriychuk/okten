package lesson05.homeWork;

import java.util.Objects;

public class Time {
    private int hour;
    private int min;

    public Time(int hour, int min) {
        this.min = min;
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return min == time.min && hour == time.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, hour);
    }

    @Override
    public String toString() {
        return "Time{" +
                "min=" + min +
                ", hour=" + hour +
                '}';
    }

    public void checkTime(Time time){
        if (time.min >= 0 && time.min <= 59 && time.hour >= 0 && time.hour <= 23) {
            System.out.println("Ok");
        }
        // To do Time format ex
    }
}
