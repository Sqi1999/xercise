package com.mybatis.dome.demo.test.Sort;

import java.util.Objects;

/**
 * 二分查找（基于有序数组）
 * @param <Key>
 * @param <Value>
 */
public class BinarySearchST<Key extends Comparable<Key>,Value> {
    private Key[] keys;
    private Value [] vals;
    private  int N;
    public BinarySearchST(int capacity){
        keys= (Key[]) new Comparable[capacity];
        vals= (Value[]) new Object[capacity];
    }
    public int size(){
        return  N;
    }
   /* public Value get(Key key){

    }*/

    //返回表中小于Key的数量
    public int rank(Key key,int lo,int hi){
        if (hi<lo) return  lo;
        int mid =lo+(hi-lo)/2;
        int cmp=key.compareTo(keys[mid]);
        if (cmp <0)
            return rank(key,lo,mid-1);
        else if (cmp>0)
            return rank(key,mid+1,hi);
        else
            return mid;
    }
}
