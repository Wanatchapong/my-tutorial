package com.me.tutorial.java8;

/**
 * Created by wanatchapong on 1/4/2017 AD.
 * Credit by https://blog.idrsolutions.com/2014/10/5-minutes-explanation-java-lambda-expression/
 *
 * It is an anonymous function that allows you to pass methods as arguments or simply,
 * a mechanism that helps you remove a lot of boilerplate code.
 * They have no access modifier(private, public or protected),
 * no return type declaration and no name.
 *
 * Syntax of Lambda
 * (args1, args2, ...) -> { body }
 * It can have receive zero, one or more parameters.
 * i.e ( ) -> { do something } , (int a) -> { do something }, (int a, int b, ..., n) -> { do something }
 * It is not mandatory to use parenthesis when there is a single parameter.
 * i.e. a -> { do something}
 *
 */
public class LambdaExpression {

    public static void main(String[] args) {
        // No lambda expression
        NameInterface nameInstance = new NameInterface() {
            @Override
            public void sayName(String name) {
                System.out.println("My name is " + name);
            }
        };
        doSayName(nameInstance, "Duke");

        // With lambda expression
        doSayName(name -> System.out.println("My name is " + name), "Dick");
    }

    private static void doSayName(NameInterface nameInstance, String name) {
        nameInstance.sayName(name);
    }
}

interface NameInterface {

    void sayName(String name);
}