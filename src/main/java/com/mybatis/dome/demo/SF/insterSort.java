package com.mybatis.dome.demo.SF;

/**
 * 插入排序
 */
public class insterSort {
    public static void sort(Comparable [] a){
        if (a.length==0&&a.length<2){
            return;
        }

        for (int i = 0; i < a.length; i++) {

            for (int j = i-1; j>=0&&less(a[j],a[j+1]) ; j--) {
             ecxh(a,j,j+1);
            }
        }
    }
    public static void ecxh(Comparable [] a,int x,int y){
        Comparable z=a[x];a[x]=a[y];a[y]=z;
    }
    public static boolean less(Comparable x,Comparable y){
        return x.compareTo(y)<0;
    }


}
