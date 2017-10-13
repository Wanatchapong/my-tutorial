package com.me.tutorial;

import org.junit.Before;
import org.junit.Test;
import ru.lanwen.verbalregex.VerbalExpression;

import java.util.regex.Pattern;

/**
 * Created by wanatchapong on 5/17/2017 AD.
 */
public class RegexTest {

    @Before
    public void setUp() throws Exception {
        VerbalExpression regex = VerbalExpression.regex()
                .add("_")
                .word().zeroOrMore()
                .endOfLine()
                .build();
        System.out.println(regex.toString());
    }

    @Test
    public void test() throws Exception {
        Pattern pattern = Pattern.compile("(?i)(\\w+)_((19|20)\\d\\d)(0?[1-9]|1[012])(0?[1-9]|[12][0-9]|3[01]).txt");

        String fileName = "fivestar_2017050300005_20170516.txt";
        System.out.println(fileName + "\t\t->\t\t" + pattern.matcher(fileName).matches());

        fileName = "_20170516.txt";
        System.out.println(fileName + "\t\t->\t\t" + pattern.matcher(fileName).matches());

        fileName = "fivestar_2017050300005_.txt";
        System.out.println(fileName + "\t\t->\t\t" + pattern.matcher(fileName).matches());

        fileName = "fivestar_2017050300005_20170516";
        System.out.println(fileName + "\t\t->\t\t" + pattern.matcher(fileName).matches());
    }
}
