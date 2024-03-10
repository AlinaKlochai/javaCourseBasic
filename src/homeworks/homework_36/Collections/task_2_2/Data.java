package homeworks.homework_36.Collections.task_2_2;

public class Data implements Comparable<Data> {
    private int countOfDay;

    public Data(int countOfDay) {
        this.countOfDay = countOfDay;
    }

    @Override
    public int compareTo(Data other) {
        return Integer.compare(this.countOfDay, other.countOfDay);
    }

    @Override
    public String toString() {
        return "Data{" +
                "countOfDay=" + countOfDay +
                '}';
    }
}
