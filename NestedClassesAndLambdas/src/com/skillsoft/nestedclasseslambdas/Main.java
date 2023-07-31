package com.skillsoft.nestedclasseslambdas;

import java.util.*;
import java.util.function.Supplier;

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

        HomeCreator homeCreatorAnonymous = new HomeCreator() {
            @Override
            public Home create(String type, String city, int areaSqFt, int price) {
                return new Home(type, city, areaSqFt, price);
            }
        };

        Home home1 = homeCreatorAnonymous.create(
                "brownstone", "New York", 1200, 1200000);
        System.out.println("Anonymous class: " + home1);

        HomeCreator homeCreatorLambdaExpression = (type, city, areaSqFt, price) ->
                new Home(type, city, areaSqFt, price);

        Home home2 = homeCreatorLambdaExpression.create(
                "townhome", "Bellevue", 3300, 500000);

        System.out.println("Lambda expression: " + home2);

        HomeCreator homeCreatorMethodReference = Home::new; // parameterized constructor method reference to construct a Home object and implement HomeCreator interface

        Home home3 = homeCreatorMethodReference.create(
                "condo", "Bellevue", 3500, 1000000);

        System.out.println("Method reference: " + home3);

//        Supplier<Home> homeAnonymousClassSupplier = new Supplier<Home>() {
//            @Override
//            public Home get() {
//                return new Home();
//            }
//        };
//
//        System.out.println("Anonymous class: " + homeAnonymousClassSupplier.get());
//
//        Supplier<Home> homeLambdaExpressionSupplier = () -> new Home();
//
//        System.out.println("Lambda expression: " + homeLambdaExpressionSupplier.get());
//
//        Supplier<Home> homeMethodReferenceSupplier = Home::new; // no argument constructor method reference to construct a Home object and implement Supplier interface
//
//        System.out.println("Method reference: " + homeMethodReferenceSupplier.get());

//        List<Home> homesList = populateAndGetHomesList();
//
//        System.out.println("Original: \n" + homesList);
//
//        homesList.sort(Home::compareTypes); // instance method reference of an arbitrary type Home
//
//        System.out.println("Sorted: \n" + homesList);

//        List<String> writers = Arrays.asList("Ernest Hemingway", "J.K. Rowling", "Haruki Murakami", "Roald Dahl");
//
//        writers.sort(String::compareToIgnoreCase); // instance method reference of an arbitrary type String
//
//        System.out.println(writers);

//        System.out.println("\"A\".compareToIgnoreCase(\"B\"): " + "A".compareToIgnoreCase("B"));
//        System.out.println("\"B\".compareToIgnoreCase(\"A\"): " + "B".compareToIgnoreCase("A"));
//        System.out.println("\"A\".compareToIgnoreCase(\"a\"): " + "A".compareToIgnoreCase("a"));
//        System.out.println("\"B\".compareToIgnoreCase(\"b\"): " + "B".compareToIgnoreCase("b"));
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