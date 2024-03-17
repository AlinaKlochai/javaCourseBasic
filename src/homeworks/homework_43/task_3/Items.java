package homeworks.homework_43.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Items {
    public static void main(String[] args) throws IOException {


            List<Item> items = readItemsFromCSV("src/homeworks/homework_43/task_3/Items.csv");         //преобразуем информацию из фвйла в массив

            // Вывод суммы товаров с описанием "product"
            double productSum = calculateProductSum(items);
            System.out.println("Сумма товаров с описанием 'product': " + productSum);

            // Поиск товара 'caffe' с ценой 10.58
            double searchPrice = 10.58;
            Item foundItem = findItemByPrice(items, "products", searchPrice);
            if (foundItem != null) {
                System.out.println("Найден товар 'caffe' с ценой " + searchPrice + ": " + foundItem);
            } else {
                System.out.println("Товар 'caffe' с ценой " + searchPrice + " не найден.");
            }
        }

        // Метод для чтения товаров из CSV файла
        public static List<Item> readItemsFromCSV (String filename) throws IOException {
            List<Item> items = new ArrayList<>();
            String line;
            String cvsSplitBy = ","; // разделитель в файле

            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                // Пропускаем заголовок CSV файла
                reader.readLine();

                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(cvsSplitBy);
                    String name = data[0];
                    double price = Double.parseDouble(data[1]);
                    String description = data[2];
                    Item item = new Item(name, price, description);
                    items.add(item);
                }
            }
            return items;
        }

        // Метод для вычисления суммы товаров с описанием "product"
        public static double calculateProductSum (List < Item > items) {
            double sum = 0;
            for (Item item : items) {
                if (item.getDescription().equalsIgnoreCase("products")) {
                    sum += item.getPrice();
                }
            }
            return sum;
        }

        // Метод для поиска товара по описанию и цене
        public static Item findItemByPrice (List <Item> items, String description,double price){
            for (Item item : items) {
                if (item.getDescription().equals(description) && item.getPrice() == price) {
                    return item;
                }
            }
            return null; // Если товар не найден
        }
    }

