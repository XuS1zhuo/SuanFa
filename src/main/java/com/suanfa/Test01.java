package com.suanfa;

/**
 * @Author XuS1zhuo
 * @Description TODO
 * @Date 2023/1/5 9:04
 * @Version 1.0
 */
                                 /*找出n以内的素数总数*/
public class Test01 {
    public static void main(String[] args) {
        int n = 100;
        //暴力破解
        int count1 = find(n);
        //埃塞法
        int count2 = aiSai(n);

        System.out.println(count1);
        System.out.println(count2);
    }

    private static int aiSai(int n) {
        System.out.println("aiSai法的计算次数是:");
        int sum = 0;
        boolean[] isPrime = new boolean[n];  //全是false ,false便是合数
        int count = 0;
        for (int i = 2; i < n; i++){
            if (!isPrime[i]){
                count ++;
                //把这个素数的倍数纳入合数
                for (int j = i*i; j < n; j+=i){
                    isPrime[j] = true;
                    sum ++;
                }
            }
        }
        System.out.println(sum);
        return count;
    }

    private static int find(int n) {
        int count = 0;
        for (int i = 2; i < n; i++){
            if (isPrime(i)){
                count ++;
            }
        }
        return count;
    }

    private static boolean isPrime(int i) {

        for (int j = 2; j*j <= i; j++){
            if (i % j == 0){
                return false;
            }
        }
        return true;
    }
}
