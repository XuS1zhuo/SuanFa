package com.suanfa.leetcode;

/**
 * @Author XuS1zhuo
 * @Description TODO
 * @Date 2023/1/16 21:39
 * @Version 1.0
 */

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两整数，并返回它们的数组下标。

 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

 * 你可以按任意顺序返回答案。

 */
public class Test01 {
    public static void main(String[] args) {
        int []nums = {2,7,11,15,1,8,3,6,5,4};
        int target = 9;
        int[] ints = Test01.twoSum(nums, target);
        for (int i:ints) {
            System.out.print(i + " ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = 0; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

}
