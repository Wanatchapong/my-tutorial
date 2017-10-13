package com.me.tutorial;

import org.junit.Assert;
import org.junit.Test;

public class RomanCalculatorTest {

    @Test
    public void test() throws Exception {
        String output1 = format(calculate("XX", "+", "II"));
        String output2 = format(calculate("II", "+", "II"));
        String output3 = format(calculate("XIV", "+", "LX"));
        String output4 = format(calculate("V", "+", "V"));

        Assert.assertEquals(output1, "XXII");
        Assert.assertEquals(output2, "IV");
        Assert.assertEquals(output3, "LXXIV");
        Assert.assertEquals(output4, "X");
    }

    private int calculate(String leftOperand, String operator, String rightOperand) {
        int leftNumber = parse(leftOperand);
        int rightNumber = parse(rightOperand);
        int result = 0;
        if (operator.equals("+")) {
            result = leftNumber + rightNumber;
        }
        else if (operator.equals("-")) {
            result = leftNumber - rightNumber;
        }
        else if (operator.equals("*")) {
            result = leftNumber * rightNumber;
        }
        else if (operator.equals("/")) {
            result = leftNumber / rightNumber;
        }
        else if (operator.equals("%")) {
            result = leftNumber % rightNumber;
        }
        return result;
    }

    private String format(int value) {
        String romanNum = "";
        while (value > 0) {
            while (value >= 1000) {
                romanNum = romanNum + "M";
                value -= 1000;
            }
            while (value >= 900) {
                romanNum = romanNum + "CM";
                value -= 900;
            }
            while (value >= 500) {
                romanNum = romanNum + "D";
                value -= 500;
            }
            while (value >= 400) {
                romanNum = romanNum + "CD";
                value -= 400;
            }
            while (value >= 100) {
                romanNum = romanNum + "C";
                value -= 100;
            }
            while (value >= 90) {
                romanNum = romanNum + "XC";
                value -= 90;
            }
            while (value >= 50) {
                romanNum = romanNum + "L";
                value -= 50;
            }
            while (value >= 40) {
                romanNum = romanNum + "XL";
                value -= 40;
            }
            while (value >= 10) {
                romanNum = romanNum + "X";
                value -= 10;
            }
            while (value >= 9) {
                romanNum = romanNum + "IX";
                value -= 9;
            }
            while (value >= 5) {
                romanNum = romanNum + "V";
                value -= 5;
            }
            while (value >= 4) {
                romanNum = romanNum + "IV";
                value -= 4;
            }
            while (value >= 1) {
                romanNum = romanNum + "I";
                value -= 1;
            }
        }
        return romanNum;
    }

    private int parse(String number) {
        int lengthOfNumber = number.length();

        int[] value = new int[lengthOfNumber];

        for (int i = lengthOfNumber; i > 0; i -= 1) {
            if (number.charAt(i - 1) == ('I')) {
                value[i - 1] = 1;
            } else if (number.charAt(i - 1) == ('V')) {
                value[i - 1] = 5;
            } else if (number.charAt(i - 1) == ('X')) {
                value[i - 1] = 10;
            } else if (number.charAt(i - 1) == ('L')) {
                value[i - 1] = 50;
            } else if (number.charAt(i - 1) == ('C')) {
                value[i - 1] = 100;
            } else if (number.charAt(i - 1) == ('D')) {
                value[i - 1] = 500;
            } else if (number.charAt(i - 1) == ('M')) {
                value[i - 1] = 1000;
            } else {
                return -1;
            }
        }

        for (int i = 0; i < lengthOfNumber - 3; i += 1) {
            if (value[i] == value[i + 1] && value[i + 1] == value[i + 2] && value[i + 2] == value[i + 3]) {
                return -1;
            }
        }

        int total = value[lengthOfNumber - 1];
        for (int i = lengthOfNumber; i > 1; i -= 1) {
            if (value[i - 1] <= value[i - 2]) {
                total += value[i - 2];
            }
            if (value[i - 1] > value[i - 2]) {
                total -= value[i - 2];
            }
        }
        return total;
    }
}
