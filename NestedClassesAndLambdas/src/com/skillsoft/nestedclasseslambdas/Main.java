package com.skillsoft.nestedclasseslambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Home> populateAndGetHomesList() {

        Home home1 = new Home("brownstone", "New York", 1200, 1000000);
        Home home2 = new Home("house", "Seattle", 5200, 1500000);
        Home home3 = new Home("townhome", "Bellevue", 3300, 500000);
        Home home4 = new Home("condo", "Mumbai", 3500, 1000000);
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

    private static List<Home> filter(List<Home> homesList, HomeFilter... homeFilters) {

        List<Home> filteredList = new ArrayList<>();

        for (Home home : homesList) {

            boolean allCriteriaApplicable = true;

            for (HomeFilter homeFilter : homeFilters) {
                if (!homeFilter.test(home)) {
                    allCriteriaApplicable = false;

                    break;
                }
            }

            if (allCriteriaApplicable) {
                filteredList.add(home);
            }
        }

        return filteredList;
    }

//    private static List<Home> filter(List<Home> homesList, HomeFilter homeFilter) {
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

        List<Home> homesList = populateAndGetHomesList();

        System.out.println("*** Original list: \n" + homesList);

        List<Home> filteredList = filter(homesList,
                home -> (home.getAreaSqFt() > 3000 && home.getAreaSqFt() < 5500),
                home -> home.getPrice() < 1000000);
//                home -> (home.getPrice() < 1000000 && home.getType().equals("townhome")));
//                home -> (home.getAreaSqFt() > 3000 && home.getAreaSqFt() < 5500)); // lambda

//        List<Home> filteredList = filter(homesList, new HomeFilter() { // Anonymous new HomeFilter() can be replaced with lambda
//
//            @Override
//            public boolean test(Home home) {
//                return home.getAreaSqFt() > 3000 && home.getAreaSqFt() < 5500;
//            }
//        });

        System.out.println("*** Filtered list: \n" + filteredList);
    }
}

// Lambda Expressions
// A short block of code which takes in input arguments and performs an action or returns a value