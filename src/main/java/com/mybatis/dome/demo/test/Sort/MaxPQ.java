package com.mybatis.dome.demo.test.Sort;

public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;    //机油堆的完全按二叉树
    private int N = 0;    //存储于pq[1..N]中,pq[0]没有使用

    public MaxPQ(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public boolean isEmpty() {
        return N == 0;

    }

    public int size() {
        return N;
    }

    public void isert(Key v) {
        pq[++N] = v;
        swim(N);
    }
    public Key delMax(){
        Key max=pq[1];  //从根节点得到最大元素
        exch(1,N--);  //将其后最后一个结点交换
        pq[N+1]=null;   //防止越界
        sink(1);    //恢复堆的有序性
        return  max;
    }
    //比较
    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) > 0;
    }
    //替换
    private void exch(int i, int j) {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }
    //上浮
    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k/2,k);
            k=k/2;
        }
    }
    //下沉
    private void sink(int k){
        while (2*k<=N){
            int j=2*k;   //获取到父节点
            if (j<N&&less(j,j+1)) j++;
            if (!less(k,j)) break;
            exch(k,j);
            k=j;
        }
    }
}
