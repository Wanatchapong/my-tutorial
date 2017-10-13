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

    @Test
    public void replaceVsConcat() throws Exception {
        long now = System.currentTimeMillis();
        append();
        System.out.println("append elapsed " + (System.currentTimeMillis() - now) + " ms");

        now = System.currentTimeMillis();
        concat();
        System.out.println("concat elapsed " + (System.currentTimeMillis() - now) + " ms");
    }

    @Test
    public void intern() throws Exception {
        System.out.println("intern : " + (("a" + "b" + "c").intern() == "abc"));
        System.out.println("not intern : " + (("a" + "b" + "c") == "abc"));
    }

    @Test
    public void convertStringToInteger() throws Exception {
        Integer number = Integer.parseInt("0714");
        System.out.println(number);
    }

    private void append() {
        for (int i = 0; i < 1000000; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("A").append("B").append("C").append("D").append("E").append("F").append("G");
        }
    }

    private void concat() {
        for (int j = 0; j < 1000000; j++) {
            String ss = "A" + "B" + "C" + "D" + "E" + "F" + "G";
        }
    }
}
