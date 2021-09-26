package com.mybatis.dome.demo.test;

public class shaobing {



    public static void main(String[] args) {
        int a[]={4,2,3,5,9,6};
        int n=a.length;
        int key =8;
        shaobing s=new shaobing();
        int b=s.find(a,n,key);
        System.out.println(b);
    }
public int find(int [] a,int n ,int key){
    if(a==null||n<=0){
        return  -1;
    }
    if(a[n-1]==key){
        return n-1;
    }
    int tmp=a[n-1];
    a[n-1]=key;

    int i=0;
    while(a[i]!=key){
        i++;
    }
    a[n-1]=tmp;
    if(i==n-1){
        return -1;
    }else{
        return i;
    }
}
}
