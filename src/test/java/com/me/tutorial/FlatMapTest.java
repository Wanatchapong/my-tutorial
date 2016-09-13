package com.me.tutorial;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by wanatchapong
 */
public class FlatMapTest {

    @Test
    public void flatMap() throws Exception {
        List<Developer> developers = new ArrayList<>();

        Developer adam = new Developer("Adam");
        adam.addProgrammingLanguage("Java");
        adam.addProgrammingLanguage("JavaScript");
        adam.addProgrammingLanguage("C++");

        Developer john = new Developer("John");
        john.addProgrammingLanguage("Kotlin");
        john.addProgrammingLanguage("Swift");
        john.addProgrammingLanguage("Go");
        john.addProgrammingLanguage("Python");
        john.addProgrammingLanguage("PHP");

        developers.add(adam);
        developers.add(john);

        List<String> programmingLanguages = developers.stream()
                .map(Developer::getProgrammingLanguages)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        Assert.assertTrue(programmingLanguages.containsAll(adam.getProgrammingLanguages()));
        Assert.assertTrue(programmingLanguages.containsAll(john.getProgrammingLanguages()));
    }

    class Developer {

        private String name;
        private Set<String> programmingLanguages;

        public Developer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Set<String> getProgrammingLanguages() {
            if (programmingLanguages == null) {
                this.programmingLanguages = new HashSet<>();
            }
            return programmingLanguages;
        }

        public void setProgrammingLanguages(Set<String> programmingLanguages) {
            this.programmingLanguages = programmingLanguages;
        }

        public void addProgrammingLanguage(String language) {
            getProgrammingLanguages().add(language);
        }
    }
}
