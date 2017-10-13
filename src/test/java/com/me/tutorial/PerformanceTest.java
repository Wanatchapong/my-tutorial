package com.me.tutorial;

import org.junit.Test;

/**
 * Created by wanatchapong on 5/31/2017 AD.
 */
public class PerformanceTest {

    @Test
    public void test() throws Exception {
        long start = System.currentTimeMillis();

        int t = 0;
        int numWork = 200_000_000;
        for (int i = numWork; i > 0; --i) {
            t++;
        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.println("total is : " + t + " in " + elapsed + "ms");
    }
}
