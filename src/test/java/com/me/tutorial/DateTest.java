package com.me.tutorial;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wanatchapong on 5/2/2017 AD.
 */
public class DateTest {
    @Test
    public void format() throws Exception {
        String formatted = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").format(new Date());
        System.out.println(formatted);
        String formatted2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date());
        System.out.println(formatted2);
    }

    @Test
    public void timestamp() throws Exception {
        long t = 4292774275462963L;

    }
}
