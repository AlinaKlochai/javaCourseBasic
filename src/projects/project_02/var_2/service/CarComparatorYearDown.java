package projects.project_02.var_2.service;

import projects.project_02.var_2.entity.Car;

import java.util.Comparator;

public class CarComparatorYearDown implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Integer.compare(car2.getYear(), car1.getYear());
    }
}
