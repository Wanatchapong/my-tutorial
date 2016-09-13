package com.me.tutorial;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
