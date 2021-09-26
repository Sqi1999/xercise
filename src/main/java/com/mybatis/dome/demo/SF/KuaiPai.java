package com.mybatis.dome.demo.SF;

public class KuaiPai {

    public static void sort(Comparable []a){
        sort(a,0, a.length-1);
    }
    private static void sort(Comparable []a,int lo,int hi){

        if (hi<lo) return;
        int y=iskp(a,lo,hi); //找到基准值
        sort(a,lo,y-1);
        sort(a,y+1,hi);
    }

    private static int iskp(Comparable []a ,int lo,int hi) {
        int i=lo;int j=hi+1;
        Comparable v=a[lo];

        while (true){
            while (less(a[++i],v)) if (i==hi) break;
            while (less(v,a[--j])) if (j==lo) break;
            if (i>=j) break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }

    private static boolean  less(Comparable x,Comparable y){
        return x.compareTo(y)<0;
    }
    private static void exch(Comparable [] a,int i,int j){
        Comparable t=a[i];a[i]=a[j];a[j]=t;
    }
    public static void show(Comparable [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
    public static boolean isSort(Comparable []a){
        for (int i = 1; i < a.length; i++) {
            if (less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Comparable a[]={56,23,48,4,68,84,11,2,58,4,78,5,2,59};

        sort(a);
        boolean sort = isSort(a);
        System.out.println(sort);
        show(a);
    }
}
