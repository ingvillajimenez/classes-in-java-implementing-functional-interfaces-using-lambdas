package com.skillsoft.nestedclasseslambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void greet(String message, Greeting greeting) {
        greeting.simpleGreeting(message);
    }

    public static void main(String[] args) {

        Greeting anonymousGreeting = new Greeting() {
            @Override
            public void simpleGreeting(String greeting) {
                System.out.println(greeting);
            }

            @Override
            public String toString() {
                return "String representation of this anonymous class";
            }
        };

        Greeting lambdaExpressionGreeting = greeting -> System.out.println(greeting);

        Greeting lambdaBlockGreeting = greeting -> {
            System.out.println("---");
            System.out.println(greeting);
            System.out.println("---");
        };

        greet("Wish you a good day!", anonymousGreeting);
        greet("Welcome aboard!", lambdaExpressionGreeting);
        greet("Hi there!", lambdaBlockGreeting);

        System.out.println();

        anonymousGreeting.anotherGreeting();
        lambdaExpressionGreeting.anotherGreeting();
        lambdaBlockGreeting.anotherGreeting();

        System.out.println();

        Greeting.oneMoreGreeting();
        Greeting.oneMoreGreeting();
        Greeting.oneMoreGreeting();

//        System.out.println(anonymousGreeting);
//        System.out.println(lambdaExpressionGreeting);
//        System.out.println(lambdaBlockGreeting);
//
//        System.out.println();
//
//        System.out.println("Anonymous greeting class: " + anonymousGreeting.getClass());
//        System.out.println("Lambda expression greeting class: " + lambdaExpressionGreeting.getClass());
//        System.out.println("Lambda block greeting class: " + lambdaBlockGreeting.getClass());
//
//        System.out.println("anonymousGreeting instanceof Object: " +
//                (anonymousGreeting instanceof Object)); // true
//        System.out.println("lambdaExpressionGreeting instanceof Object: " +
//                (lambdaExpressionGreeting instanceof Object)); // true
//        System.out.println("lambdaBlockGreeting instanceof Object: " +
//                (lambdaBlockGreeting instanceof Object)); // true

//        greet("Howdy!", new Greeting() {
//            @Override
//            public void simpleGreeting(String greeting) {
//                System.out.println(greeting);
//            }
//        });
//
//        greet("How are you", greeting -> System.out.println(greeting));
//
//        greet("Good morning everybody!", greeting -> {
//            System.out.println("----");
//            System.out.println(greeting);
//            System.out.println("----");
//        });

    }
}

// Lambda Expressions
// A short block of code which takes in input arguments and performs an action or returns a value

// Functional Interface
// An interface with exactly one abstract method