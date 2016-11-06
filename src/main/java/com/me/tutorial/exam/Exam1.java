package com.me.tutorial.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanatchapong
 */
public class Exam1 {

    public static List<Integer> hailstoneSequence(int n) {
        final List<Integer> list = new ArrayList<Integer>();
        while (n != 1) {
            list.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        list.add(n);
        return list;
    }
}
