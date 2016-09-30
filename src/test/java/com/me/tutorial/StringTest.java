package com.me.tutorial;

import org.junit.Test;

/**
 * Created by wanatchapong
 */
public class StringTest {

    @Test
    public void replaceRegExpAndSplitWithComma() throws Exception {
        String s = "[\"WEB\",\"MOBILE_WEB\",\"MOBILE\",\"POS\"]";
        s = s.replaceAll("\"|\\[|\\]", "");
        System.out.println("after replace " + s);
        System.out.println("split to array");
        String[] ss = s.split(",");
        for (String sp : ss) {
            System.out.println(sp);
        }
    }
}
