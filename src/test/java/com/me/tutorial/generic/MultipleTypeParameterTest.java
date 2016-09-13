package com.me.tutorial.generic;

import org.junit.Test;

/**
 * Created by wanatchapong
 */
public class MultipleTypeParameterTest {

    interface Pair<K, V> {
        public K getKey();
        public V getValue();
    }

    class OrderedPair<K, V> implements Pair<K, V> {

        private K key;
        private V value;

        public OrderedPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }
    }

    @Test
    public void test() throws Exception {
        OrderedPair<String, Integer> p1 = new OrderedPair<>("Abc", 3);
        OrderedPair<String, String> p2 = new OrderedPair<>("Hello", "World");
    }
}
