package com.me.tutorial;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

/**
 * Created by wanatchapong on 5/5/2017 AD.
 */
public class CharsetTest {

    @Test
    public void utf8() throws Exception {
        System.out.println("name : " + StandardCharsets.UTF_8.name() + ", display name : " + StandardCharsets.UTF_8.displayName());
    }
}
