package homeworks.homework_40.task_7;

public class Product {
    private String name;
    private String category;
    private double price;
    private int countInWarehouse;

    public Product(String name, String category, double price, int countInWarehouse) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.countInWarehouse = countInWarehouse;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getCountInWarehouse() {
        return countInWarehouse;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", countInWarehouse=" + countInWarehouse +
                '}';
    }
}
