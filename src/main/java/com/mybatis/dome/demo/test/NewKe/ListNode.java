package com.mybatis.dome.demo.test.NewKe;

import javax.management.ListenerNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListNode {
    public static void main(String[] args) {
        Node head=new Node("我");
        head.add("爱");
        head.add("你");
        head.print();
        ListNode list=new ListNode();
        Node head2=list.Reversal(head);
        System.out.println();
        head2.print();
    }

    //反转
    private Node Reversal(Node head){
        if(head==null){
            return head;
        }
        Node next=null;
        Node rep=null;
        while (head!=null){
            next=head.next;
            head.next=rep;

            rep=head;
            head=next;

        }
        return rep;
    }

}
