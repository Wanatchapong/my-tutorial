package com.me.tutorial.generic;

import org.junit.Test;

/**
 * Created by wanatchapong
 */
public class GenericMethodTest {

    class MyPair<K, V> {
        private K key;
        private V value;

        public MyPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    class MyComparator {

        //The syntax for a generic method includes a type parameter, inside angle brackets, and appears before the method's return type
        public <K, V> boolean compare(MyPair<K, V> p1, MyPair<K, V> p2) {
            return p1.getKey().equals(p2.getKey()) &&
                    p1.getValue().equals(p2.getValue());
        }
    }

    @Test
    public void test() throws Exception {
        MyPair<Integer, String> p1 = new MyPair<>(1, "A");
        MyPair<Integer, String> p2 = new MyPair<>(2, "B");
        MyComparator comparator = new MyComparator();
        boolean same = comparator.<Integer, String>compare(p1, p2);
        System.out.println("same : " + same);
    }
}
