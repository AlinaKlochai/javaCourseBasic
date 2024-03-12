package homeworks.homework_36.Collections.task_2_7;

import homeworks.homework_36.Collections.task_2_2.Data;

public class Time implements Comparable<Time> {
    private int time;

    public Time(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public int compareTo(Time other) {
        return Integer.compare(this.getTime(), other.getTime());
    }

    @Override
    public String toString() {
        return "Time{" +
                "time=" + time +
                '}';
    }
}

