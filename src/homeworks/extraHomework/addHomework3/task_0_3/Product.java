package homeworks.extraHomework.addHomework3.task_0_3;

public class Product {
    private String name;
    private double regularPrice;
    private double discout;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getDiscout() {
        return discout;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscout(double discout) {
        this.discout = discout;
    }

    public double calculateActualPrice(){
        double actualPrice = regularPrice - (regularPrice * (discout / 100));
        System.out.println("Цена на товар с учетом скидки : " + actualPrice);
        return actualPrice;
    }
}
