package com.me.tutorial;

import com.me.tutorial.anno.MyClass;
import org.junit.Test;

/**
 * Created by wanatchapong on 12/14/2016 AD.
 */
public class MethodAnnotationTest {

    @Test
    public void test() throws Exception {
        MyClass c = new MyClass();
        c.getClass().getMethods();
    }
}
