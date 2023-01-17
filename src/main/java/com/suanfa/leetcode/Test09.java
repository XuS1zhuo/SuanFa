package com.suanfa.leetcode;

/**
 * @Author XuS1zhuo
 * @Description TODO
 * @Date 2023/1/16 22:06
 * @Version 1.0
 */
/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

 *  回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 * 例如，121 是回文，而 123 不是。

 */
public class Test09 {
    public static void main(String[] args) {
        int x = 12321;
        boolean palindrome = Test09.isPalindrome(x);
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(int x) {
       String xStr = x +"";
        int length = xStr.length();
        for (int i =0; i<length;i++){
            if (xStr.charAt(i) != xStr.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }

}
