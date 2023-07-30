package com.skillsoft.nestedclasseslambdas;

public class Main {

    public static void greet(String name, String customGreeting, int numTimes, Greeting greeting) {
        System.out.println(greeting.greetMultipleTimes(name, customGreeting, numTimes));
    }

//    public static void greet(String name, String customGreeting, Greeting greeting) {
//        System.out.println(greeting.customGreetingByName(name, customGreeting));
//    }

//    public static void greet(String name, Greeting greeting) {
//        System.out.println(greeting.simpleGreetingByName(name));
//    }

//    public static void greet(Greeting greeting) {
//        System.out.println(greeting.simpleGreeting());
//    }

    public static void main(String[] args) {

        greet("John", "Good morning!", 3, new Greeting() {
            @Override
            public String greetMultipleTimes(String name, String customGreeting, int numTimes) {

                String greeting = String.format("%s %s\n", customGreeting, name);

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < numTimes; i++) {
                    sb.append(greeting);
                }

                return sb.toString();
            }
        });

        greet("Carrie", "Welcome aboard!", 2,
                (String name, String customGreeting, int numTimes) ->
                        String.format("**%s %s**\n", customGreeting, name).repeat(numTimes));

        greet("Ronald", "Good evening, how are you today?", 3,
                (String name, String customGreeting, int numTimes) ->
                        String.format("--%s %s--\n", customGreeting, name).repeat(numTimes));

//        greet("Carrie", "Welcome aboard!", 2,
//                (name, customGreeting, numTimes) ->
//                        String.format("**%s %s**\n", customGreeting, name).repeat(numTimes)); // lambda expression
//
//        greet("Ronald", "Good evening, how are you today?", 3,
//                (name, customGreeting, numTimes) ->
//                        String.format("--%s %s--\n", customGreeting, name).repeat(numTimes)); // lambda expression

//        greet("Carrie", "Welcome aboard!", 2,
//                (name, customGreeting, numTimes) -> {
//                    return String.format("**%s %s**\n", customGreeting, name).repeat(numTimes); // Statement lambda can be replaced with expression lambda
//                });
//
//        greet("Ronald", "Good evening, how are you today?", 3,
//                (name, customGreeting, numTimes) -> {
//                    return String.format("--%s %s--\n", customGreeting, name).repeat(numTimes); // Statement lambda can be replaced with expression lambda
//                });

//        greet("Carrie", "Welcome aborad!", 2,
//                (name, customGreeting, numTimes) -> {
//                    String greeting = String.format("**%s %s**\n", customGreeting, name);
//
//                    StringBuilder sb = new StringBuilder();
//
//                    for (int i = 0; i < numTimes; i++) {
//                        sb.append(greeting);
//                    }
//
//                    return sb.toString();
//                });
//
//        greet("Ronald", "Good evening, how are you today?", 3,
//                (name, customGreeting, numTimes) -> {
//                    String greeting = String.format("--%s %s--\n", customGreeting, name);
//
//                    StringBuilder sb = new StringBuilder();
//
//                    for (int i = 0; i < numTimes; i++) {
//                        sb.append(greeting);
//                    }
//
//                    return sb.toString();
//                });

//        greet("John", "Good morning!", new Greeting() {
//            @Override
//            public String customGreetingByName(String name, String customGreeting) {
//                return (customGreeting + " " + name);
//            }
//        });
//
//        greet("Carrie", "Welcome aboard!",
//                (name, customGreeting) -> customGreeting + " " + name);
//
//        greet("Ronald", "Good evening, how are you today?",
//                (name, customGreeting) -> name + " " + customGreeting);

//        greet("John", new Greeting() {
//            @Override
//            public String simpleGreetingByName(String name) {
//                return ("Hello " + name);
//            }
//        });
//
//        greet("Carrie", name -> "Good morning! " + name);
//
//        greet("Ronald", name -> name + " It's a beautiful day!");

//        greet("Carrie", (name) -> "Good morning! " + name);
//
//        greet("Ronald", (name) -> name + " It's a beautiful day!");

//        greet(new Greeting() {
//            @Override
//            public String simpleGreeting() {
//                return "Hello world!";
//            }
//        });
//
//        greet(() -> "Good morning!");
//
//        greet(() -> "Here is a simple interface method which takes in no parameters!");
    }
}

// Lambda Expressions
// A short block of code which takes in input arguments and performs an action or returns a value