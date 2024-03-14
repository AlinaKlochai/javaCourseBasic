package homeworks.homework_41.task_3;

import java.util.List;

public class Order {

    private List<Purcase> purcases;
    private int month;

    public Order(List<Purcase> purcases, int month) {
        this.purcases = purcases;
        this.month = month;
    }

    public List<Purcase> getPurcases() {
        return purcases;
    }

    public int getMonth() {
        return month;
    }
}
