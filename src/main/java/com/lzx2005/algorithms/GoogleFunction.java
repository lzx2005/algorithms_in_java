package com.lzx2005.algorithms;

/**
 * Created by Lizhengxian on 2017/2/23.
 * 有一个由字符组成的等式： WWWDOT - GOOGLE = DOTCOM
 * 每个字符代表一个0-9之间的数字，WWWDOT，GOOGLE和DOTCOM都是合法的数字，不能以0开头
 * 请找出一组字符和数字的对应关系，使他们互相替换，并且替换后的数字能够满足等式。
 */
public class GoogleFunction {
    //递归方法
    public void searchResult(CharItem[] charItems,boolean[] valueUses,int index){
        if(index == charItems.length){
            validFunction(charItems);
            return;
        }

        for(int i=0;i<charItems.length;i++){
            //打头的字母不能为0
            if((charItems[index].isLeading()&&(i==0))||valueUses[i]){
            }else{
                valueUses[i]=true;
                charItems[index].setValue(i);
                searchResult(charItems,valueUses,index+1);
                valueUses[i]=false;
            }
        }
    }

    public void validFunction(CharItem[] charItems){
        //WWWDOT-GOOGLE=DOTCOM
        char[] n1 = "WWWDOT".toCharArray();
        char[] n2 = "GOOGLE".toCharArray();
        char[] n3 = "DOTCOM".toCharArray();

        int i1 = toIntByWord(charItems,n1);
        int i2 = toIntByWord(charItems,n2);
        int i3 = toIntByWord(charItems,n3);
        //System.out.println(i1);
        if((i1-i2)==i3){
            System.out.println(i1+"-"+i2+"="+i3);
        }
    }

    private int toIntByWord(CharItem[] charItems, char[] chars) {
        int returnValue = 0;
        int length = chars.length;
        for(int i =0;i<length;i++){
            returnValue+=findByChar(charItems,chars[i])*Math.pow(10d,length-i-1);
        }
        return returnValue;
    }

    public int findByChar(CharItem[] charItems,char c){
        for(CharItem charItem : charItems){
            if(charItem.getC()==c){
                return charItem.getValue();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //初始化字母
        CharItem[] charItems = {
                new CharItem('W',-1,true),
                new CharItem('D',-1,true),
                new CharItem('O',-1,false),
                new CharItem('T',-1,false),
                new CharItem('G',-1,true),
                new CharItem('L',-1,false),
                new CharItem('E',-1,false),
                new CharItem('C',-1,false),
                new CharItem('M',-1,false),
        };

        //判断0-9这几个数字是否被占用
        //valueUses[0] = false 表示0这个数字没有被占用
        //valueUses[1] = false 表示1这个数字被占用
        boolean[] valueUses = {false,false,false,false,false,false,false,false,false};
        new GoogleFunction().searchResult(charItems, valueUses,0);

    }
}

/**
 * 这个类定义了一个字母和数字的对应关系
 * 一个字母，对应了一个数字
 * leading为true表示这个字幕是打头的，所以不能为0，例如DOTCOM中的D字母，就不能为0。
 */
class CharItem{
    private char c;
    private int value;
    private boolean leading;

    public CharItem() {
    }

    public CharItem(char c, int value, boolean leading) {
        this.c = c;
        this.value = value;
        this.leading = leading;
    }

    @Override
    public String toString() {
        return "CharItem{" +
                "c=" + c +
                ", value=" + value +
                ", leading=" + leading +
                '}';
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isLeading() {
        return leading;
    }

    public void setLeading(boolean leading) {
        this.leading = leading;
    }
}

/**
 * 这个类表示0-9中的某个数字被占用的情况
 */
class tagCharValue{
    private boolean used;
    private int value;

    public tagCharValue() {
    }

    public tagCharValue(boolean used, int value) {
        this.used = used;
        this.value = value;
    }

    @Override
    public String toString() {
        return "tagCharValue{" +
                "used=" + used +
                ", value=" + value +
                '}';
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}