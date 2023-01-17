package com.suanfa.leetcode;

/**
 * @Author XuS1zhuo
 * @Description TODO
 * @Date 2023/1/17 18:49
 * @Version 1.0
 */

import java.awt.image.ImageProducer;
import java.util.HashMap;

/**
 * 罗马数字转整数
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * 如果前面数字比后面小就是减法
 */

public class Test13 {

    public static final HashMap<Character, Integer> MAP = new HashMap<>();

    static {
        MAP.put('I', 1);
        MAP.put('V', 5);
        MAP.put('X', 10);
        MAP.put('L', 50);
        MAP.put('C', 100);
        MAP.put('D', 500);
        MAP.put('M', 1000);
    }


    public static void main(String[] args) {
        String input = "MCMXCIV";
        int result = romanToInt(input);
        System.out.println(result);

    }

    public static int romanToInt(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        int stop = chars.length;
        for (int i = 0; i < chars.length; i++) {
            Integer integer1 = MAP.get(chars[i]);
            if (i != stop - 1){
                Integer integer2 = MAP.get(chars[i + 1]);
                if (integer1 < integer2){
                    result -= integer1;
                }else {
                    result += integer1;
                }
            }else {
                result += integer1;
            }
        }

        return result;
    }


}



















