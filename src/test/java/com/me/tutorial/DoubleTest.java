package com.me.tutorial;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by wanatchapong on 7/14/2017 AD.
 */
public class DoubleTest {

    @Test
    public void test() throws Exception {
        BigDecimal b = new BigDecimal(3.329900272139);
        System.out.println(b.unscaledValue());
    }
}
