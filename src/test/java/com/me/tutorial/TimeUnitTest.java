package com.me.tutorial;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by wanatchapong on 3/8/2017 AD.
 */
public class TimeUnitTest {

    @Test
    public void milliSecToSeconds() throws Exception {
        long milliSec = 60472L;
        System.out.println(TimeUnit.MILLISECONDS.toSeconds(milliSec));
    }
}
