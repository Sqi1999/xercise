package com.mybatis.dome.demo.test.NewKe;

public class Node {
    public Object data;
    public  Node next;
    Node(Object data){
        this.data=data;
    }

    //添加结点
    public  void add(Object data){
        if(this.next==null){
            this.next=new Node(data);
        }else{
            this.next.add(data);
        }
    }

    //打印链表
    // 打印链表
    public void print() {
        System.out.print(this.data);
        if(this.next != null)
        {
            System.out.print("-");
            this.next.print();
        }
    }

    //链表反转
    public Node Reversal(Node head){
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
