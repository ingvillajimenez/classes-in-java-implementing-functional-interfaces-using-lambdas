package com.skillsoft.nestedclasseslambdas;

public class Home {

    private String type;
    private String city;
    private int areaSqFt;
    private int price;

    public Home() {
    }

    public Home(String type, String city, int areaSqFt, int price) {
        this.type = type;
        this.city = city;
        this.areaSqFt = areaSqFt;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getCity() {
        return city;
    }

    public int getAreaSqFt() {
        return areaSqFt;
    }

    public int getPrice() {
        return price;
    }

    public int compareTypes(Home h) { // instance method
        return this.type.compareTo(h.type);
    }

    @Override
    public String toString() {
        return String.format("\nType: %s, city: %s, area: %d, price: %d",
                type, city, areaSqFt, price);
    }

//    public static int compareByPrice(Home home1, Home home2) { // static method
//        return Integer.valueOf(home1.price).compareTo(home2.price);
//    }
}