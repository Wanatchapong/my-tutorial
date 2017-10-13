package com.me.tutorial;

import org.junit.Test;

public class BinaryTest {

    @Test
    public void test() throws Exception {
        System.out.print(binaryToHex("00110110"));
        System.out.print(" " + binaryToHex("00110111"));
        System.out.print(" " + binaryToHex("00100000"));
        System.out.println(" " + binaryToHex("00110110"));

        System.out.print(binaryToHex("01100110"));
        System.out.print(" " + binaryToHex("00100000"));
        System.out.print(" " + binaryToHex("00110111"));
        System.out.println(" " + binaryToHex("00110100"));

        System.out.print(binaryToHex("00100000"));
        System.out.print(" " + binaryToHex("00110110"));
        System.out.print(" " + binaryToHex("01100110"));
        System.out.println(" " + binaryToHex("00100000"));
    }

    private String binaryToHex(String binary) {
        return Integer.toString(Integer.parseInt(binary, 2), 16);
    }

    private String hexToBinary(String hex) {
        return Integer.toString(Integer.parseInt(hex, 16), 2);
    }
}
