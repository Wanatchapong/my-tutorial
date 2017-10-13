package com.me.tutorial.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wanatchapong on 1/4/2017 AD.
 * Credit by https://blog.idrsolutions.com/2014/11/java-8-streams-explained-5-minutes/
 */
public class Stream {

    private enum Job {SWORD_MAN, ARCHER, ACOLYT, MERCHANT, THIEF}

    private static class Character {
        private String name;
        private Job job;

        public Character(String name, Job job) {
            this.name = name;
            this.job = job;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Job getJob() {
            return job;
        }

        public void setJob(Job job) {
            this.job = job;
        }
    }

    public static void main(String[] args) {
        List<Character> characters = Arrays.asList(
                new Character("John", Job.SWORD_MAN),
                new Character("Alice", Job.MERCHANT),
                new Character("Jack", Job.THIEF),
                new Character("Ben", Job.SWORD_MAN),
                new Character("Elic", Job.ARCHER)
        );

        System.out.println("--- Sword Man ---");
        characters.stream()
                .filter(c -> c.getJob() == Job.SWORD_MAN)
                .forEach(c -> System.out.println(c.getName()));

        System.out.println("--- Start with \"J\"");
        characters.stream()
                .filter(c -> c.getName().startsWith("J"))
                .forEach(c -> System.out.println(c.getName()));
    }
}
