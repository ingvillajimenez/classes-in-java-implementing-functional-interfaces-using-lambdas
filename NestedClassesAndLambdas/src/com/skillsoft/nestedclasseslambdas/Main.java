package com.skillsoft.nestedclasseslambdas;

import java.util.*;

public class Main {

    private static List<Home> populateAndGetHomesList() {

        Home home1 = new Home("brownstone", "New York", 1200, 1200000);
        Home home2 = new Home("house", "Seattle", 5200, 300000);
        Home home3 = new Home("townhome", "Bellevue", 3300, 500000);
        Home home4 = new Home("condo", "Bellevue", 3500, 1000000);

        List<Home> homesList = new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);
        homesList.add(home4);

        return homesList;
    }

    public static void main(String[] args) {

        class ComparisonUtility {

            public int compareByPrice(Home h1, Home h2) {
                return Integer.valueOf(h1.getPrice()).compareTo(h2.getPrice());
            }

            public int compareByAreaSqFt(Home h1, Home h2) {
                return Integer.valueOf(h1.getAreaSqFt()).compareTo(h2.getAreaSqFt());
            }
        }

        List<Home> homesList = populateAndGetHomesList();

        ComparisonUtility comparisonUtility = new ComparisonUtility();

        System.out.println("Original: \n" + homesList);

        Collections.sort(homesList, comparisonUtility::compareByAreaSqFt);
//        Collections.sort(homesList, comparisonUtility::compareByPrice);

        System.out.println("Sorted: \n" + homesList);

//        List<Home> homesList = populateAndGetHomesList();
//
//        System.out.println("Original: \n" + homesList);
//
//        Collections.sort(homesList, Home::compareByPrice); // static method reference
//
//        System.out.println("Sorted: \n" + homesList);

//        List<Home> homesList = populateAndGetHomesList();
//
//        System.out.println("Original: \n" + homesList);
//
//        Collections.sort(homesList, (o1, o2) -> Home.compareByPrice(o1, o2)); // lambda expression
//
//        System.out.println("Sorted: \n" + homesList);

//        List<Home> homesList = populateAndGetHomesList();
//
//        System.out.println("Original: \n" + homesList);
//
//        Collections.sort(homesList, new Comparator<Home>() { // anonymous class
//            @Override
//            public int compare(Home o1, Home o2) {
//                return Home.compareByPrice(o1, o2);
//            }
//        });
//
//        System.out.println("Sorted: \n" + homesList);

//        List<String> writers = Arrays.asList("Ernest Hemingway", "J.K. Rowling", "Haruki Murakami", "Roald Dahl");
//
//        System.out.println("Displaying elements using traditional for loop");
//        for (String writer : writers) {
//            System.out.println(writer);
//        }
//
//        System.out.println("\nDisplaying elements using lambda expression");
//        writers.forEach(writer -> System.out.println(writer)); // Lambda can be replaced with method reference
//
//        System.out.println("\nDisplaying elements using method reference");
//        writers.forEach(System.out::println); // println static method that is part of the System.out class
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