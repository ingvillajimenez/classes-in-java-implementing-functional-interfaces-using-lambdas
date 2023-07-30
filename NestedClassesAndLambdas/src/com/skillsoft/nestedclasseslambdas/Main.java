package com.skillsoft.nestedclasseslambdas;

public class Main {

    public static void main(String[] args) {

        Greeting simpleGreetingAnonymous = new Greeting() {
            @Override
            public String simpleGreetingByName(String name) {
                return "Hello, " + name;
            }
        };

        System.out.println(simpleGreetingAnonymous.simpleGreetingByName("Alice"));

        Greeting simpleGreetingLambdaWithTypes = (String name) -> "Good morning, " + name;

        System.out.println(simpleGreetingLambdaWithTypes.simpleGreetingByName("Bob"));

        Greeting simpleGreetingLambdaWithoutTypes = (name) -> "Welcome, " + name;

        System.out.println(simpleGreetingLambdaWithoutTypes.simpleGreetingByName("Charlie"));

        Greeting simpleGreetingLambdaWithoutParenthesis = name -> "Howdy, " + name;

        System.out.println(simpleGreetingLambdaWithoutParenthesis.simpleGreetingByName("Donna"));

        Greeting simpleGreetingLambdaWithBlock = name -> {
            name = name.toUpperCase();
            return "Hi there, " + name;
        };

        System.out.println(simpleGreetingLambdaWithBlock.simpleGreetingByName("Elise"));

        System.out.println("\n*****");
        System.out.println(simpleGreetingAnonymous.simpleGreeting());
        System.out.println(simpleGreetingLambdaWithTypes.simpleGreeting());
        System.out.println(simpleGreetingLambdaWithoutTypes.simpleGreeting());
        System.out.println(simpleGreetingLambdaWithoutParenthesis.simpleGreeting());
        System.out.println(simpleGreetingLambdaWithBlock.simpleGreeting());

//        Greeting simpleGreetingAnonymous = new Greeting() {
//            @Override
//            public String simpleGreeting() {
//                return "Hello world from an anonymous function!";
//            }
//        };
//
//        Greeting simpleGreetingLambda = () -> "Hello world from a lambda expression!";
//
//        System.out.println(simpleGreetingAnonymous.simpleGreeting());
//        System.out.println(simpleGreetingLambda.simpleGreeting());

    }
}

// Lambda Expressions
// A short block of code which takes in input arguments and performs an action or returns a value

// Functional Interface
// An interface with exactly one abstract method