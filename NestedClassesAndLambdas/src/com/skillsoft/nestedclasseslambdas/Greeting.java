package com.skillsoft.nestedclasseslambdas;

public interface Greeting {

    String simpleGreetingByName(String name); // abstract method

    default String simpleGreeting() { // default implementation
        return "Default greeting!";
    }

//    String simpleGreeting();
}
