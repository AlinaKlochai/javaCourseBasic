package homeworks.homework_41.task_3;

public class Purcase {
    private String nameOfProduct;
    private double price;

    public Purcase(String nameOfProduct, double price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Purcase{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", price=" + price +
                '}';
    }
}
