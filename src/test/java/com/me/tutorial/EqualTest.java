package com.me.tutorial;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by wanatchapong on 3/16/2017 AD.
 */
public class EqualTest {

    @Test
    public void equalBigDecimal() throws Exception {
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("1.00");
        System.out.println(b1.equals(b2));
    }
}
