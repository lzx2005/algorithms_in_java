package com.lzx2005;

import java.util.Random;

/**
 * 测试用例，保存一些数组
 * @author Li Zhengxian
 */
public class Data {

    /**
     * 基本数组,1-10乱序
     * */
    public static int[] a = {5,1,6,3,9,7,4,2,8,10};

    /**
     * 获取指定大小的随机乱序数组
     * @param size  指定大小
     * @return
     */
    public static int[] getRandomArray(int size){
        int length =size;
        int[] x = new int[length];
        for(int i=0;i<length;i++){
            x[i] =i;
        }
        Random random = new Random();
        for(int i=0;i<length*2;i++){
            int i1 = random.nextInt(length);
            int i2 = random.nextInt(length);
            BasicClass.exch(x,i1,i2);
        }
        return x;
    }


    /**
     * 打印数组
     * @param data  数组
     */
    public static void printData(int[] data){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]);
            if(i!=data.length-1){
                //不是最后一个
                System.out.print(", ");
            }else{
                System.out.println();
            }
        }
    }
}
