package homeworks.homework_41.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderApp {
    public static void main(String[] args) {
        Purcase purcase1 = new Purcase("milk",1);
        Purcase purcase2 = new Purcase("bread",2);
        Purcase purcase3 = new Purcase("cafe",10);

        List<Purcase> purcases1 = Arrays.asList(purcase1,purcase2,purcase3);
        Order order1 = new Order(purcases1, 6);

        Purcase purcase4 = new Purcase("ring",700);
        Purcase purcase5 = new Purcase("pen",600);
        Purcase purcase6 = new Purcase("cafe",10);

        List<Purcase> purcases2 = Arrays.asList(purcase4, purcase5, purcase6);
        Order order2 = new Order(purcases2, 4);

        Purcase purcase7 = new Purcase("phone",300);
        Purcase purcase8 = new Purcase("phone 2",500);

        List<Purcase> purcases3 = Arrays.asList(purcase7, purcase8);
        Order order3 = new Order(purcases3, 12);


        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        Map<Integer, Double> totatlPriceInOneMonth = orders.stream()
                .collect(Collectors.groupingBy(Order::getMonth,                                           //grouping by Month, and then month go to Integer
                        Collectors.summingDouble(order -> order.getPurcases().stream()                   //getPurcases from order then in stream
                                .mapToDouble(Purcase::getPrice)
                                .sum())));

        System.out.println("Total sum purcases by month");
        totatlPriceInOneMonth.forEach((month, total) ->
                System.out.println("Month: " + month + ", Total price: " + total));

    }
}
