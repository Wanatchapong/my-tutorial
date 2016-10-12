package com.me.tutorial;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by wanatchapong
 */
public class BigDecimalTest {

    private static final BigDecimal VALUE = new BigDecimal("123.0700000000000000621724893790087662637233734130859375");

    @Test
    public void toPlainString() throws Exception {
        System.out.println(VALUE.toPlainString());
    }

    @Test
    public void toEngineeringString() throws Exception {
        System.out.println(VALUE.toEngineeringString());
    }

    @Test
    public void toValueString() throws Exception {
        System.out.println(VALUE.toString());
    }

    @Test
    public void initialWithMathContext() throws Exception {
        Double doubleValue = 123.0700000000000000621724893790087662637233734130859375;

        MathContext mc = new MathContext(2);
        BigDecimal d = BigDecimal.valueOf(doubleValue);

        System.out.println(d.toPlainString());
        System.out.println(d.toEngineeringString());
        System.out.println(d.toString());
    }
}
