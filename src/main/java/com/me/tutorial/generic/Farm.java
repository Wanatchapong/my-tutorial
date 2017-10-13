package com.me.tutorial.generic;

/**
 * Created by wanatchapong on 6/6/2017 AD.
 */
public class Farm {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Miew");

        Animal dog = new Dog();
        dog.setName("Lucky");

        Farm farm = new Farm();
        farm.doAnimal(cat);

        farm.doAnimal(dog);
    }

    private <T extends Animal> void doAnimal(T animalClass) {
        System.out.println("animal name : " + animalClass.getName());
    }
}
