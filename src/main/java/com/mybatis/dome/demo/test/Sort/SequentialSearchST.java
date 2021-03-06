package com.mybatis.dome.demo.test.Sort;

public class SequentialSearchST<Key,Value> {

    private  Node first; //链表首节点
    private class Node{//链表结点的定义
        Key key;
        Value value;
        Node next;
        public  Node(Key key,Value value,Node next){
            this.key=key;
            this.value=value;
            this.next=next;
        }
    }

    public Value get(Key key){//查找给定的键，返回相关联的职
        for (Node x=first;x!=null;x=x.next)
            if(key.equals(x.key))
                return x.value;  //命中
            return null;   //未命中
    }
    public void put(Key key,Value value){ //查找给定的键，找到则更新其值，否则在表中新建结点
        for (Node x=first; x!=null;x=x.next)
            if (key.equals(x.key))
            {x.value=value;return;} //命中，更新
        first=new Node(key,value,first); //未命中，新建结点

    }
}
