package com.me.tutorial;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

/**
 * Created by wanatchapong on 1/18/2017 AD.
 */
public class Md5Test {

    @Test
    public void encrypt() throws Exception {
        String expectMd5 = "";
        String actualMd5 = DigestUtils.md5Hex("กกก");
        System.out.println(actualMd5);
    }
}
