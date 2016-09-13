package com.me.tutorial.generic;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wanatchapong
 */
public class GenericTypeTest {

    /**
     * E - Element (used extensively by the Java Collections Framework)
     * K - Key
     * N - Number
     * T - Type
     * V - Value
     * S,U,V etc. - 2nd, 3rd, 4th types
     * @param <T>
     */
    class Box<T> {
        private T t;

        public T get() {
            return t;
        }

        public void set(T t) {
            this.t = t;
        }
    }

    @Test
    public void parameterizeAsInteger() throws Exception {
        Box<Integer> box = new Box<>();
        box.set(10);
        Assert.assertTrue(box.get() == 10);
    }

    @Test
    public void parameterizeAsString() throws Exception {
        Box<String> box = new Box<>();
        box.set("Hello");
        Assert.assertEquals("Hello", box.get());
    }
}
