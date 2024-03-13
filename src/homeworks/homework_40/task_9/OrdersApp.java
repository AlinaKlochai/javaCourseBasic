package homeworks.homework_40.task_9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.
 */
public class OrdersApp {

    public static void main(String[] args) {
        List<Order> orderList = Arrays.asList(
                new Order(1,12,400.0,"in process"),
                new Order(2,12,100.0,"in process"),
                new Order(3,6,480.0,"in process"),
                new Order(4,6,700.0,"in process")
        );


        Map<Integer, Double> totalPriceInMonth = orderList.stream()
                .collect(Collectors.groupingBy(
                        Order::getMonth,
                        Collectors.summingDouble(Order::getPrice)
                ));

        System.out.println(totalPriceInMonth);

    }
}
