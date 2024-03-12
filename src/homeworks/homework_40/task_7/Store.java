package homeworks.homework_40.task_7;

import homeworks.homework_40.task_8.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Store {
    public static void main(String[] args) {
        Product p1 = new Product("product 1","category 1",100.0,5);
        Product p2 = new Product("product 2","category 1",180.0,2);
        Product p3 = new Product("product 3","category 1",200.0,4);
        Product p4 = new Product("product 4","category 2",120.0,15);
        Product p5 = new Product("product 5","category 2",300.0,100);
        Product p6 = new Product("product 6","category 2",120.0,100);
        Product p7 = new Product("product 7","category 3",300.0,50);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);

        System.out.println("All products in warehouse:");
        for (Product product : products) {
            System.out.println(product);
        }

            OptionalDouble averagePriceCategory1 = products.stream()
                    .filter(p -> p.getCategory().equals("category 1"))
                    .filter(p -> p.getCountInWarehouse() > 2)
                    .mapToDouble(Product::getPrice)                                           // достали из Product price
                    .average();                                                            // average(), вычисляет среднее значение всех элементов в потоке

            if (averagePriceCategory1.isPresent()) {
                System.out.println("Average price products in category 1: " + averagePriceCategory1.getAsDouble());
            } else {
                System.out.println("No products in this category");
            }

            List<Product> products1 = products.stream()
                    .filter(p -> p.getCategory().equals("category 1"))
                    .filter(p -> p.getCountInWarehouse() > 2)
                    .sorted((product1,product2) -> Double.compare(product2.getPrice(), product1.getPrice()))
                    .toList();

        System.out.println("All products in category 1 more then 2 units:");
        for (Product product : products1) {
            System.out.println(product);
        }

        OptionalDouble averagePriceCategory2 = products.stream()
                .filter(p -> p.getCategory().equals("category 2"))
                .filter(p -> p.getCountInWarehouse() > 20)
                .mapToDouble(Product::getPrice)                                           // достали из Product price
                .average();                                                            // average(), вычисляет среднее значение всех элементов в потоке

        if (averagePriceCategory2.isPresent()) {
            System.out.println("Average price products in category 2: " + averagePriceCategory2.getAsDouble());
        } else {
            System.out.println("No products in this category");
        }


        List<Product> products2 = products.stream()
                .filter(p -> p.getCategory().equals("category 2"))
                .filter(p -> p.getCountInWarehouse() > 20)
                .sorted((product1,product2) -> Double.compare(product2.getPrice(), product1.getPrice()))
                .toList();

        System.out.println("All products in category 2 more then 20 units:");
        for (Product product : products2) {
            System.out.println(product);
        }

        OptionalDouble averagePriceCategory3 = products.stream()
                .filter(p -> p.getCategory().equals("category 3"))
                .filter(p -> p.getCountInWarehouse() > 80)
                .mapToDouble(Product::getPrice)                                           // достали из Product price
                .average();                                                            // average(), вычисляет среднее значение всех элементов в потоке

        averagePriceCategory3.ifPresentOrElse(
                avgPrice -> System.out.println("Average price products in category 3: " + avgPrice),
                () -> System.out.println("No products in category 3")
        );


    }
}

