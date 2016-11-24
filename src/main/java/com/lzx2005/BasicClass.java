package com.lzx2005;

/**
 * Created by Administrator on 2016/11/24 0024.
 */
public class BasicClass {

    public static void exch(int[] a,int i,int j){
        int k = a[i];
        a[i] = a[j];
        a[j] = k;
    }
}
