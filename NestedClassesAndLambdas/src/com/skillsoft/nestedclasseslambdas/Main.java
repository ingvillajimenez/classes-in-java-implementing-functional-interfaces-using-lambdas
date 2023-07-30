package com.skillsoft.nestedclasseslambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void greet(String message, Greeting greeting) {
        greeting.simpleGreeting(message);
    }

    public static void main(String[] args) {

        greet("Howdy!", new Greeting() {
            @Override
            public void simpleGreeting(String greeting) {
                System.out.println(greeting);
            }
        });

        greet("How are you", greeting -> System.out.println(greeting));

        greet("Good morning everybody!", greeting -> {
            System.out.println("----");
            System.out.println(greeting);
            System.out.println("----");
        });

    }
}

// Lambda Expressions
// A short block of code which takes in input arguments and performs an action or returns a value

// Functional Interface
// An interface with exactly one abstract method