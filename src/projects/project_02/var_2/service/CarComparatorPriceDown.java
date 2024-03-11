package projects.project_02.var_2.service;

import projects.project_02.var_2.entity.Car;

import java.util.Comparator;

public class CarComparatorPriceDown implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Double.compare(car2.getPrice(), car1.getPrice());
    }
}
