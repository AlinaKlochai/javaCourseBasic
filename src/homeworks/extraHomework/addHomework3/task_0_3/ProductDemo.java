package homeworks.extraHomework.addHomework3.task_0_3;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Книга");
        product.setRegularPrice(200);
        product.setDiscout(10);
        product.calculateActualPrice();
    }
}
