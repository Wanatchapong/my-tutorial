package com.me.tutorial;

import org.junit.Test;

import java.io.File;

/**
 * Created by wanatchapong on 1/12/2017 AD.
 */
public class FileTest {

    @Test
    public void getFile() throws Exception {
        File abcJson = new File(FileTest.class.getResource("/abc.json").getFile());
        System.out.println(abcJson.exists());
    }
}
