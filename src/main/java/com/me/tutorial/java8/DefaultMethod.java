package com.me.tutorial.java8;

/**
 * Created by wanatchapong on 1/4/2017 AD.
 */
public class DefaultMethod implements InterfaceA, InterfaceB {

    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }

    @Override
    public void sayHi() {
        System.out.println("Hi from implementation class");
        InterfaceA.super.sayHi();
    }

    public static void main(String[] args) {
        DefaultMethod instance = new DefaultMethod();
        instance.sayHello();
        instance.sayHi();
    }
}

interface InterfaceA {

    void sayHello();

    default void sayHi() {
        System.out.println("Hi from Interface A");
    }
}

interface InterfaceB {

    default void sayHi() {
        System.out.println("Hi from Interface B");
    }
}
