package com.lzx2005.point_to_offer_nowcoder;

import java.util.ArrayList;

/**
 * Created by Lizhengxian on 2017/3/8.
 * 输入一个链表，从尾到头打印链表每个节点的值。
 *  class ListNode {
 *       int val;
 *       ListNode next = null;
 *       ListNode(int val) {
 *           this.val = val;
 *       }
 *  }
 */


public class PrintListFromTailToHead {
    ArrayList<Integer> integers =new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null){
            return integers;
        }
        if(listNode.next==null){
            integers.add(listNode.val);
        }else{
            integers = printListFromTailToHead(listNode.next);
            integers.add(listNode.val);
        }
        return integers;
    }

    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(7);

        listNode0.next=listNode1;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;
        ArrayList<Integer> integers = new PrintListFromTailToHead().printListFromTailToHead(null);
        for(Integer i : integers){
            System.out.println(i);
        }
    }
}



class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}