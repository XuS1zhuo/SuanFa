package com.suanfa.Common;

/**
 * @Author XuS1zhuo
 * @Description TODO
 * @Date 2023/1/12 16:06
 * @Version 1.0
 */
public class Tools {

    //打印输出数组
    public static void printArray(int[] array){
        System.out.println("元素一共有" + array.length + "个");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
