package com.skillsoft.nestedclasseslambdas;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);
}
