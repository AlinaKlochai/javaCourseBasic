package projects.project_02.var_2.service;

import projects.project_02.var_2.entity.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarDealer {

     private HashMap<String, Car> cars;

    public CarDealer() {
        this.cars = new HashMap<>();
    }

    public void addCarToList(String vin, Car car){
        cars.put(vin, car);
    }

    public void removeCarFromList(String vin){
        cars.remove(vin);
    }

    public void updateCarPrice(String vin, double price){
        Car car = cars.get(vin);
        if (!cars.containsKey(vin)) {
            System.out.println("Car with VIN " + vin + " not found.");
        } else {
            car.setPrice(price);
            System.out.println("Car with VIN " + vin + " has been given a new price: " + price);
        }
    }

    public void updateCarRating(String vin, double rating){
        Car car = cars.get(vin);
        if (!cars.containsKey(vin)) {
            System.out.println("Car with VIN " + vin + " not found.");
        } else {
            car.setRating(rating);
            System.out.println("Car with VIN " + vin + " has been given a new rating: " + rating);
        }
    }

    public void findCarByBrand(String brand) {
        List<Car> carsByBrand = new ArrayList<>();
        for (Car car : cars.values()) {
            if (car.getBrand().equals(brand)) {
                carsByBrand.add(car);
            }
        }
        if (carsByBrand.isEmpty()) {
            System.out.println("Cars with " + brand + " brand are out of stock.");
        } else {
            System.out.println("Cars with the " + brand + " brand:");
            for (Car car : carsByBrand) {
                System.out.println(car);
            }
        }
    }

    public void findCarByModel(String model){
        List<Car> carsByModel = new ArrayList<>();
        for (Car car : cars.values()){
            if (car.getModel().equals(model)){
                carsByModel.add(car);
            }
        }
        if(carsByModel.isEmpty()){
            System.out.println("Cars with " + model + " model are out of stock.");
        }else {
            System.out.println("Cars with the " + model + " model:");
            for (Car car : carsByModel) {
                System.out.println(car);
            }
        }
    }

    public void findCarByYear(int year){
        List<Car> carsByYear = new ArrayList<>();
        for (Car car : cars.values()){
            if (car.getYear() == year){
                carsByYear.add(car);
            }
        }
        if(carsByYear.isEmpty()){
            System.out.println("Cars with " + year + " year are out of stock.");
        }else {
            System.out.println("Cars with " + year + " year:");
            for (Car car : carsByYear) {
                System.out.println(car);
            }
        }

    }

    public void printAllCars() {
        for (Car car : cars.values()) {
            System.out.println(car);
        }
    }

    public void setRatingFromCustomer(String vin, int rating){
        Car car = cars.get(vin);
        if (car != null){
            car.setRating(rating);
            System.out.println("Car with VIN " + vin + " has been given a new rating: " + rating);
        }else {
            System.out.println("Car with VIN " + vin + " not found");
        }
    }

    public void sortCarsByRating(){
        List<Car> sortedCars = new ArrayList<>(cars.values());

        sortedCars.sort(new CarComparatorRating());
        System.out.println("Cars sorted by rating: ");
        for (Car car : sortedCars){
            System.out.println(car);
        }
    }

    public void sortCarsByPrice(){
        List<Car> sortedCars = new ArrayList<>(cars.values());

        sortedCars.sort(new CarComparatorPrice());
        System.out.println("Cars sorted by price: ");
        for (Car car : sortedCars){
            System.out.println(car);
        }
    }

    public void sortCarsByYear(){
        List<Car> sortedCars = new ArrayList<>(cars.values());

        sortedCars.sort(new CarComparatorYear());
        System.out.println("Cars sorted by year: ");
        for (Car car : sortedCars){
            System.out.println(car);
        }
    }


}
