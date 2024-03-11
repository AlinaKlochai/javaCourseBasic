package projects.project_02.var_2;

import projects.project_02.var_2.entity.Car;
import projects.project_02.var_2.service.CarDealer;

public class CarApp {
    public static void main(String[] args) {

        CarDealer carDealer = new CarDealer();

        carDealer.addCarToList("185-356", new Car("Ford","S-Max", 2015, 45000, 4.2));
        carDealer.addCarToList("352-357", new Car("Audi","A8", 2021, 65000, 4.8));
        carDealer.addCarToList("759-547", new Car("Mercedes","CLE Cabriolet", 2024, 66400, 4.9));
        carDealer.addCarToList("594-632", new Car("BMW","M5", 2019, 48000, 4.0));
        carDealer.addCarToList("595-631", new Car("BMW","M6", 2019, 49000, 4.1));
        carDealer.addCarToList("450-076", new Car("Mercedes","G-Wagen", 2021, 100000, 4.7));

        carDealer.printAllCars();

        carDealer.removeCarFromList("185-356");
        System.out.println("All cars after removing:");
        carDealer.printAllCars();

        carDealer.updateCarPrice("594-632",47500);

        carDealer.updateCarRating("450-076", 4.6);

        carDealer.findCarByBrand("BMW");
        carDealer.findCarByModel("A8");
        carDealer.findCarByModel("A5");


        carDealer.findCarByYear(2021);
        carDealer.findCarByYear(2015);

        carDealer.sortCarsByRatingDown();
        carDealer.sortCarsByPriceUp();
        carDealer.sortCarsByYearDown();
    }
}
