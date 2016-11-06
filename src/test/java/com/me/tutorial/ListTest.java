package com.me.tutorial;

import org.junit.Test;

import java.util.*;

/**
 * Created by wanatchapong
 */
public class ListTest {

    @Test
    public void addAll() throws Exception {
        List<String> existList = Arrays.asList("A", "B", "C");

        List<String> list = new ArrayList<>();
        list.add("Z");
        list.addAll(existList);

        list.forEach(System.out::println);
    }

    @Test
    public void countDuplicate() throws Exception {
        List<String> duplicatedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            duplicatedList.add(String.valueOf(i));
        }
        for (int i = 0; i < 5; i++) {
            duplicatedList.add(String.valueOf(i));
        }

        System.out.println("My List : " + duplicatedList);

        final Set<String> duplicateSet = new HashSet<>();
        final Set<String> uniqueSet = new HashSet<>();

        for (String element : duplicatedList) {

            //If this set already contains the element, the call leaves the set unchanged and returns false.
            if (!uniqueSet.add(element)) {
                duplicateSet.add(element);
            }
        }

        System.out.println("\nHere are the unique elements from list : " + uniqueSet);
        System.out.println("\nHere are the duplicate elements from list : " + duplicateSet);

        for (String s : uniqueSet) {
            System.out.println("Frequency of " + s + " is " + Collections.frequency(duplicatedList, s));
        }
    }
}
