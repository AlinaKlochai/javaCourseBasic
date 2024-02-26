package homeworks.homework_30.task_1;

public class Flat implements Comparable<Flat> {
    private double area;
    private int countOfRoom;

    public Flat(double area, int countOfRoom) {
        this.area = area;
        this.countOfRoom = countOfRoom;
    }

    public double getArea() {
        return area;
    }

    public int getCountOfRoom() {
        return countOfRoom;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "area=" + area +
                ", countOfRoom=" + countOfRoom +
                '}';
    }

    @Override
    public int compareTo(Flat flatForCompare) {
        int compareResult = Double.compare(getArea(), flatForCompare.getArea());
        if (compareResult == 0){
           compareResult = getCountOfRoom() - flatForCompare.getCountOfRoom();
        }
        return compareResult;
    }
}
