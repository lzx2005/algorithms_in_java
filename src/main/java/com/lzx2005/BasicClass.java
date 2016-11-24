package com.lzx2005;

/**
 * Created by Administrator on 2016/11/24 0024.
 */
public class BasicClass {

    /**
     * 交换数组中两个数字
     * @param a     数组
     * @param i     下标1
     * @param j     下标2
     */
    public static void exch(int[] a,int i,int j){
        int k = a[i];
        a[i] = a[j];
        a[j] = k;
    }


    /**
     * 找出两个数中较大的那个数字
     * @param a     第一个数字
     * @param b     第二个数字
     * @return      较大的数字
     */
    public static int max(int a,int b){
        return a>b?a:b;
    }

    /**
     * 找出两个数中较小的那个数字
     * @param a     第一个数字
     * @param b     第二个数字
     * @return      较小的数字
     */
    public static int min(int a,int b){
        return a>b?b:a;
    }
}
