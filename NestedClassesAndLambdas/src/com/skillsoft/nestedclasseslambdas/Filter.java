package com.skillsoft.nestedclasseslambdas;

public interface Filter<T> { // Generic functional interface

    boolean test(T element);
}
