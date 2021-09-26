package com.mybatis.dome.demo.SF;

/**
 * 冒泡排序 好像多种实现
 */
public class BubbleSort {
    private   static boolean less(Comparable x,Comparable y){
        return  x.compareTo(y)<0 ;
    }
    private  static void exch(Comparable [] a,int x,int y){
        Comparable z=a[x]; a[x]=a[y];a[y]=z;
    }

    private static void show(Comparable [] a){
        for (int i = 0 ; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void sort(Comparable [] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (less(a[j],a[j+1])) exch(a,j,j+1);
            }
        }
    }

    public static void main(String[] args) {
        Comparable a[]={31,36,2,6,89,12,45,65,78,15,31,36,2,6,89,12,45,65,78,15,31,36,2,6,89,12,45,65,78,15,31,36,2,6,89,12,45,65,78,15,31,36,2,6,89,12,45,65,78,15,31,36,2,6,89,12,45,65,78,15};
//        long firstime = System.currentTimeMillis();
        sort(a);
//         long lasttiem = System.currentTimeMillis();
//        System.out.println(firstime);
//        System.out.println(lasttiem);
//        System.out.println(lasttiem-firstime);
        show(a);

    }


}
