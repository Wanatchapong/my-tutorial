package com.me.tutorial;

import org.junit.Test;

/**
 * Created by wanatchapong on 7/4/2017 AD.
 */
public class BooleanTest {
    
    Boolean a;

    @Test
    public void test() throws Exception {
        if (a) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }

    }
}
