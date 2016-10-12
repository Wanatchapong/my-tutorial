package com.me.tutorial;

import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

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

    @Test
    public void convertTimeMillisecondAsString() throws Exception {
        long t = System.currentTimeMillis();
        System.out.printf("%d hr , %d min, %d sec",
                TimeUnit.MILLISECONDS.toHours(t),
                TimeUnit.MILLISECONDS.toMinutes(t),
                TimeUnit.MILLISECONDS.toSeconds(t));
    }

    @Test
    public void matchGroupRepeatNumber() throws Exception {
        Pattern repeatOneNumber = Pattern.compile("(\\d)\\1{9,}");
        Pattern repeatTwoNumber = Pattern.compile("(\\d\\d)\\1{4,}");
        Pattern repeatThreeNumber = Pattern.compile("(\\d\\d\\d)\\1{2,}");

        System.out.println(repeatOneNumber.matcher("1111111111098").find());
        System.out.println(repeatTwoNumber.matcher("1212121212345").find());
        System.out.println(repeatThreeNumber.matcher("1231231234567").find());
    }
}
