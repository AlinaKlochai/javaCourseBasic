package homeworks.homework_33.task_2;

public class CatalogDemo {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        Product p1 = new Product("Milk",1.15);
        Product p2 = new Product("Schoko",2);
        Product p3 = new Product("Coffee",10);
        Product p4 = new Product("Potato",4);
        Product p5 = new Product("Milk",1.15);

        productCatalog.addProduct(1,p1);
        productCatalog.addProduct(2,p2);
        productCatalog.addProduct(3,p3);
        productCatalog.addProduct(4,p4);
        productCatalog.addProduct(1,p5);

        productCatalog.printCatalog();

        productCatalog.deleteProduct(2);
        System.out.println("Наш каталог просле удаления продукта");
        productCatalog.printCatalog();

        Product foundProduct = productCatalog.findProduct(3);
        System.out.println("Найден продукт " + foundProduct.getName() + " его цена " + foundProduct.getPrice());

    }
}
