package homeworks.homework_33.task_2;

import lessons.lesson_33.Task1.Contact;

import java.util.HashMap;
import java.util.Map;


public class ProductCatalog {

    private Map<Integer, Product> productsCatalog = new HashMap<>();

    public void addProduct(int productId, Product product){
        if (!productsCatalog.containsKey(productId)){
            productsCatalog.put(productId,product);
            System.out.println(product.getName() + " добавлен в каталог");
        }else {
            System.out.println(product.getName() + " не может быть добавлен, так как уже существует");
        }
    }

    public void deleteProduct(int productId){
        if (productsCatalog.containsKey(productId)){
         productsCatalog.remove(productId);
            System.out.println("Введенные елемент "  + productId +   " удален из каталога");
        }else {
            System.out.println("Удаление введенного елемента не может быть осуществлена, так как данного обьекта нет в списке");
        }
    }

    public Product findProduct(int productId){
        if (productsCatalog.containsKey(productId)){
            return productsCatalog.get(productId);
        }else {
            System.out.println("Продукт с " + productId + " таким идентификатором не найден");
            return null;
        }
    }

    public void printCatalog(){
        System.out.println("Все продукты в каталоге: ");
        for (Map.Entry<Integer, Product> entry : productsCatalog.entrySet()) {
            int productId = entry.getKey();
            Product product = entry.getValue();
            System.out.println("ID: " + productId + ", Имя: " + product.getName() + ", Цена: " + product.getPrice());
        }
    }

}
