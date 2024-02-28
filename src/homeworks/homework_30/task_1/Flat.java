package homeworks.homework_30.task_1;

public class Flat implements Comparable<Flat> {
    private int countOfRoom;
    private double area;

    public Flat(int countOfRoom, double area) {
        this.countOfRoom = countOfRoom;
        this.area = area;
    }

    public int getCountOfRoom() {
        return countOfRoom;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "countOfRoom=" + countOfRoom +
                ", area=" + area +
                '}';
    }

    @Override
    public int compareTo(Flat flatForCompare) {
        int compareResult = getCountOfRoom() - flatForCompare.getCountOfRoom();
        if (compareResult == 0){
            compareResult = Double.compare(getArea(), flatForCompare.getArea());;
        }
        return compareResult;
    }
}
