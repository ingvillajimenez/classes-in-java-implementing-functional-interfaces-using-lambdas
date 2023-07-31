package com.skillsoft.nestedclasseslambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Home> homesList = new ArrayList<>();
    private static int index = 0;

    static {

        Home home1 = new Home("brownstone", "New York", 1200, 1000000);
        Home home2 = new Home("house", "Seattle", 5200, 1500000);
        Home home3 = new Home("townhome", "Bellevue", 3300, 500000);
        Home home4 = new Home("condo", "Bellevue", 3500, 1000000);
        Home home5 = new Home("villa", "Bangalore", 5400, 300000);
        Home home6 = new Home("mansion", "Seattle", 7500, 10000000);

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);
        homesList.add(home5);
        homesList.add(home6);
    }

//    private static List<Home> populateAndGetHomesList() {
//
//        Home home1 = new Home("brownstone", "New York", 1200, 1000000);
//        Home home2 = new Home("house", "Seattle", 5200, 1500000);
//        Home home3 = new Home("townhome", "Bellevue", 3300, 500000);
//        Home home4 = new Home("condo", "Bellevue", 3500, 1000000);
//        Home home5 = new Home("villa", "Bangalore", 5400, 300000);
//        Home home6 = new Home("mansion", "Seattle", 7500, 10000000);
//
//        List<Home> homesList = new ArrayList<>();
//
//        homesList.add(home1);
//        homesList.add(home2);
//        homesList.add(home3);
//        homesList.add(home4);
//        homesList.add(home5);
//        homesList.add(home6);
//
//        return homesList;
//    }

    private static <T, R> void filter(Supplier<T> supplier,
                                      Predicate<T> filter,
                                      Function<T, R> function,
                                      Consumer<R> consumer) {

        T element = supplier.get();
        if (filter.test(element)) {
            R transformedElement = function.apply(element);

            consumer.accept(transformedElement);
        }
    }

//    private static <T, R> void filter(List<T> homesList, // generic method with two generic type parameters T and R
//                                   Predicate<T> filter,
//                                   Function<T, R> function,
//                                   Consumer<R> consumer) {
//
//        for (T element : homesList) {
//
//            if (filter.test(element)) {
//                R transformedElement = function.apply(element);
//
//                consumer.accept(transformedElement);
//            }
//        }
//    }

//    private static <T> void filter(List<T> elementList, Predicate<T> filter, Consumer<T> consumer) {
//
//        for (T element : elementList) {
//            if (filter.test(element)) {
//                consumer.accept(element);
//            }
//        }
//    }

//    private static <T> void filter(List<T> elementList, Predicate<T> filter) { // generic method, parameterized by type T
//
//        List<T> filteredList = new ArrayList<>();
//
//        for (T element : elementList) {
//            if (filter.test(element)) {
//                System.out.println(element);
//            }
//        }
//    }

    public static void main(String[] args) {

        for (int i = 0; i < homesList.size(); i++) {
            filter(() -> {
                Home home = homesList.get(index);

                index = (index + 1) % homesList.size();

                return home;
            },
                    home -> (home.getAreaSqFt() > 3000 &&
                            home.getAreaSqFt() < 5500 &&
                            home.getCity().equals("Bellevue")),
                    home -> {
                        home.setCity(home.getCity().toUpperCase());
                        home.setType(home.getType().toUpperCase());

                        return home;
                    },
                    home -> System.out.println(home));
        }

//        List<Home> homesList = populateAndGetHomesList();
//
//        filter(homesList,
//                home -> (home.getAreaSqFt() > 3000 &&
//                        home.getAreaSqFt() < 5500 &&
//                        home.getCity().equals("Bellevue")),
//                home -> {
//                    home.setCity(home.getCity().toUpperCase());
//                    home.setType(home.getType().toUpperCase());
//
//                    return home;
//                },
//                home -> System.out.println(home));

//        List<Home> homesList = populateAndGetHomesList();
//
//        filter(homesList,
//                home -> (home.getAreaSqFt() > 3000 &&
//                        home.getAreaSqFt() < 5500 &&
//                        home.getCity().equals("Bellevue")),
//                home -> System.out.println(home));

//        List<Home> homesList = populateAndGetHomesList();
//
//        filter(homesList, home -> (home.getAreaSqFt() > 3000 &&
//                home.getAreaSqFt() < 5500 &&
//                home.getCity().equals("Bellevue")));
    }
}

// Lambda Expressions
// A short block of code which takes in input arguments and performs an action or returns a value

// Functional Interface
// An interface with exactly one abstract method

// Predicate<T>
// Typically used to filter a collection of objects

// Consumer<T>
// Used to consume data, acts as a sink for the filtered and processed data

// Function<T, R>
// Transforms data from type T to type R

// Supplier<T>
// Used to generate objects on which you perform other operations

// java.util.function package
// Predicate<T>, Consumer<T>, Function<T, R>, Supplier<T>