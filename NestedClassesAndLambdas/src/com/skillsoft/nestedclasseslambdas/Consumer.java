package com.skillsoft.nestedclasseslambdas;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);
}
