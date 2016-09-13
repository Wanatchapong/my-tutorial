package com.me.tutorial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wanatchapong
 */
public class OptionalTest {

    private List<Item> items;

    @Before
    public void setUp() throws Exception {
        items = Arrays.asList(new Item(1, "A"), new Item(2, "B"), new Item(3, "C"));
    }

    @Test
    public void mapBeforeOrElse() throws Exception {
        String expected = "Empty";
        String itemName = items.stream()
                .filter(i -> i.getOrderNo() == 5)
                .findFirst()
                .map(Item::getName)
                .orElse(expected);
        Assert.assertEquals(expected, itemName);
    }

    class Item {
        private Integer orderNo;
        private String name;

        public Item(Integer orderNo, String name) {
            this.orderNo = orderNo;
            this.name = name;
        }

        public Integer getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(Integer orderNo) {
            this.orderNo = orderNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
