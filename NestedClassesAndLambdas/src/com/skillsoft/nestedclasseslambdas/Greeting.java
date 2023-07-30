package com.skillsoft.nestedclasseslambdas;

@FunctionalInterface
public interface Greeting {

    void simpleGreeting(String greeting);

    default void anotherGreeting() { // default implementation
        System.out.println("Default welcome greeting!");
    }

    static void oneMoreGreeting() { // static default implementation
        System.out.println("Static hello greeting!");
    }

//    int hashCode(); // base Object class method
//
//    String toString(); // base Object class method
//
//    boolean equals(Object obj); // base Object class method
}
