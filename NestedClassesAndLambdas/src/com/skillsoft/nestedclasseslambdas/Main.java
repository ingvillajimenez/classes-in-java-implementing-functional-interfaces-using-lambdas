package com.skillsoft.nestedclasseslambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Car> populateAndGetCarsList() {

        Car car1 = new Car("Honda", "Acura", 23000, 24);
        Car car2 = new Car("Honda", "Civic", 25000, 27);
        Car car3 = new Car("Toyota", "Camry", 33000, 22);
        Car car4 = new Car("Tesla", "Model S", 83000, 34);

        List<Car> carsList = new ArrayList<>();

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);

        return carsList;
    }

//    private static List<Car> filter(List<Car> carsList, Filter<Car> carFilter) {
//
//        List<Car> filteredList = new ArrayList<>();
//
//        for (Car car : carsList) {
//            if (carFilter.test(car)) {
//                filteredList.add(car);
//            }
//        }
//
//        return filteredList;
//    }

    private static List<Home> populateAndGetHomesList() {

        Home home1 = new Home("brownstone", "New York", 1200, 1000000);
        Home home2 = new Home("house", "Seattle", 5200, 1500000);
        Home home3 = new Home("townhome", "Bellevue", 3300, 500000);
        Home home4 = new Home("condo", "Bellevue", 3500, 1000000);
        Home home5 = new Home("villa", "Bangalore", 5400, 300000);
        Home home6 = new Home("mansion", "Palo Alto", 7500, 10000000);

        List<Home> homesList = new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);
        homesList.add(home5);
        homesList.add(home6);

        return homesList;
    }

    public static <T> List<T> filter(List<T> elementList, Filter<T> filter) { // generic method parameterized by type T

        List<T> filteredList = new ArrayList<>();

        for (T element : elementList) {
            if (filter.test(element)) {
                filteredList.add(element);
            }
        }

        return filteredList;
    }

//    private static List<Home> filter(List<Home> homesList, Filter<Home> homeFilter) {
//
//        List<Home> filteredList = new ArrayList<>();
//
//        for (Home home : homesList) {
//            if (homeFilter.test(home)) {
//                filteredList.add(home);
//            }
//        }
//
//        return filteredList;
//    }

    public static void main(String[] args) {

        List<Car> carsList = populateAndGetCarsList();

        List<Car> filteredCarList = filter(carsList,
                car -> (car.getPrice() < 30000 && car.getMileage() > 20));

        System.out.println("*** Filtered car list: \n" + filteredCarList);

        List<Home> homesList = populateAndGetHomesList();

        List<Home> filteredHomeList = filter(homesList,
                home -> (home.getAreaSqFt() > 3000 &&
                        home.getAreaSqFt() < 5500 &&
                        home.getCity().equals("Bellevue")));

        System.out.println("*** Filtered home list: \n" + filteredHomeList);

//        List<Car> carsList = populateAndGetCarsList();
//
//        System.out.println("*** Original list: \n" + carsList);
//
//        List<Car> filteredList = filter(carsList,
//                car -> (car.getPrice() < 30000 && car.getMileage() > 20));
//
//        System.out.println("*** Filtered list: \n" + filteredList);

//        List<Home> homesList = populateAndGetHomesList();
//
//        System.out.println("*** Original list: \n" + homesList);
//
//        List<Home> filteredList = filter(homesList,
//                home -> (home.getAreaSqFt() > 3000 &&
//                        home.getAreaSqFt() < 5500 &&
//                        home.getCity().equals("Bellevue")));
//
//        System.out.println("*** Filtered list: \n" + filteredList);

    }
}

// Lambda Expressions
// A short block of code which takes in input arguments and performs an action or returns a value

// Functional Interface
// An interface with exactly one abstract method