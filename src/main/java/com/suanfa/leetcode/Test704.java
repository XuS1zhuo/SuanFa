package com.suanfa.leetcode;

/**
 * @Author XuS1zhuo
 * @Description TODO
 * @Date 2023/1/17 23:03
 * @Version 1.0
 */
/**
 * 给定一个元素有序的（升序）整型数组 和一个目标值target,
 * 写一个函数搜索数组中的 target，
 * 如果目标值存在返回下标，否则返回 -1。
*/
public class Test704 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;
        int search = search(nums, target);
        System.out.println(search);

    }

    public static int search(int[] nums, int target) {
        for (int i =0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;

    }
}
