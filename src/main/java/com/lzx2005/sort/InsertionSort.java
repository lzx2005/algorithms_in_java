package com.lzx2005.sort;

import com.lzx2005.BasicClass;
import com.lzx2005.Data;

/**
 * 插入排序实现
 * @author Li Zhengxian
 */
public class InsertionSort extends BasicClass{

    public static void sort(int[] a){
        int length = a.length;
        for(int i=1;i<length;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    exch(a,j,j-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = Data.getRandomArray(10);
        Data.printData(array);
        sort(array);
        Data.printData(array);
    }
}
