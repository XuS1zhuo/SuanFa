package com.suanfa.Sort.SimpleSorte;

import com.suanfa.Common.Tools;

/**
 * @Author XuS1zhuo
 * @Description TODO
 * @Date 2023/1/12 16:06
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        //排序数组
        int[] array = {5,6,8,7,3,8,2,8,9,34,1,4,25};
        //排序方法
        int count = bubbleShort(array);
        Tools.printArray(array);
        System.out.println("");
        System.out.println("一共循环了:"  + count + "次");
    }

    private static int bubbleShort(int[] array) {
        //count 是计数器 计算循环次数
        int count = 0;
        for (int n = 0; n < array.length; n++){
            //每一次循环都可以找出数组中最大的元素，放在数组最后面
            //m <（array.length - n)是为了优化次数，选出的最大元素下一次不参与比较
            for(int m = 1;m <  array.length - n;m++){
                if (array[m]< array[m-1]){
                    //交换两个元素位置
                    int temp = array[m];
                    array [m] = array[m-1];
                    array[m-1] = temp;
                }
                count++;
            }
        }
        return count;
    }
}
