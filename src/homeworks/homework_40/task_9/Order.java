package homeworks.homework_40.task_9;

public class Order {

    private int id;
    private int month;
    private double price;
    private String status;

    public Order(int id, int month, double price, String status) {
        this.id = id;
        this.month = month;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getMonth() {
        return month;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", month=" + month +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }

}
