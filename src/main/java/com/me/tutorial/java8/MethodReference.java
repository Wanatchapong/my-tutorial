package com.me.tutorial.java8;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by wanatchapong on 1/4/2017 AD.
 * Credit by https://blog.idrsolutions.com/2015/02/java-8-method-references-explained-5-minutes
 *
 * Types of Method Reference
 * 1. Reference to a static method -> Class::staticMethodName
 * 2. Reference to a constructor -> ClassName::new
 * 3. Reference to an instance method of type -> Class::instanceMethodName
 * 4. Reference to an instance method of object -> object::instanceMethodName
 */
public class MethodReference {

    private static class Person {

        private final String name;
        private final Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        printStaticMethod("Hello World");
        printConstructor(28, Integer::new);
        printInstanceMethodOfType(new Person("Cark Ken", 30), Person::getName);
        printInstanceMethodOfObject(new Person("John Doe", 28), System.out::println);
    }

    public static void printStaticMethod(String name) {
        System.out.println("Static Method : " + name);
    }

    public static void printConstructor(Integer age, Function<Integer, Integer> fn) {
        System.out.println("Constructor : " + fn.apply(age));
    }

    public static void printInstanceMethodOfType(Person person, Function<Person, String> fn) {
        System.out.println("Instance Method of Type : " + fn.apply(person));
    }

    public static void printInstanceMethodOfObject(Person person, Consumer<Person> c) {
        System.out.println("Instance Method of Object ");
        c.accept(person);
    }
}
