package projects.project_02.var_2.entity;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private double rating;

    public Car(String brand, String model, int year, double price, double rating) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Brand: " + brand +
                ", Model: " + model  +
                ", year: " + year +
                ", price: " + price +
                ", rating: " + rating +
                '}';
    }
}
