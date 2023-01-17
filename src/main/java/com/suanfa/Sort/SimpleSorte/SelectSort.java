package com.suanfa.Sort.SimpleSorte;

import com.suanfa.Common.Tools;

/**
 * @Author XuS1zhuo
 * @Description TODO
 * @Date 2023/1/12 16:53
 * @Version 1.0
 */
class SelectSort {
    public static void main(String[] args) {
        //排序数组
        int[] array = {5,6,8,7,3,8,2,8,9,34,1,4,25};
        //排序方法
        int count = selectSort(array);
        Tools.printArray(array);
        System.out.println("");
        System.out.println("一共循环了:"  + count + "次");
    }

    private static int selectSort(int[] array) {
        //count 是计数器 计算循环次数
        int count = 0;
        for (int n = 0; n < array.length; n++){
            //每一次循环都可以找出数组中最大的元素，放在数组最后面
            //m = n+1是为了优化次数，选出的最小元素下一次不参与比较
            for(int m = n+1;m <  array.length;m++){
                if (array[n] > array[m]){
                    //交换两个元素位置
                    int temp = array[n];
                    array [n] = array[m];
                    array[m] = temp;
                }
                count++;
            }
        }
        return count;
    }
}
