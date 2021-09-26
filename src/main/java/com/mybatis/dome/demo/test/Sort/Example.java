//package com.mybatis.dome.demo.test.Sort;
//
//import com.google.common.collect.MinMaxPriorityQueue;
//
///**
// * 排序算法类模板
// */
//public class Example {
//    private static Comparable[] aux;
//
//    public static void sort(Comparable[] a) {
//        sort(a, 0, a.length - 1);
//    }
//
//    /**
//     * compareTo
//     * 如果参数字符串等于此字符串，则返回值 0；
//     * 如果此字符串小于字符串参数，则返回一个小于 0 的值；
//     * 如果此字符串大于字符串参数，则返回一个大于 0 的值。
//     * @param a
//     * @param lo
//     * @param hi
//     */
//    private static void sort(Comparable[] a, int lo, int hi) {
//        if(hi<=lo) return;
//        int lt=lo,i=lo+1,gt=hi;
//        Comparable v=a[lo];
//        while (i<=gt){
//            int cmp=a[i].compareTo(v);
//            if (cmp<0)exch(a,lt++,i++);
//            else if (cmp>0)exch(a,i,gt--);
//            else i++;
//        }//现在a[lo..lt-1]<v=a[lt..gt]<a[gt+1..hi] 成立
//        sort(a,lo,lt-1);
//        sort(a,gt+1,hi);
//    }
//
//
//    /**
//     * 比较数组大小
//     *
//     * @param v 当前对象
//     * @param w 比较对象
//     * @return
//     */
//    private static boolean less(Comparable v, Comparable w) {
//        return v.compareTo(w) < 0;
//    }
//
//    /**
//     * 数组替换
//     *
//     * @param a 数组
//     * @param i 当前元素
//     * @param j 替换元素
//     */
//
//    private static void exch(Comparable[] a, int i, int j) {
//        Comparable t = a[i];
//        a[i] = a[j];
//        a[j] = t;
//
//    }
//
//    /**
//     * 单行打印数组
//     *
//     * @param a
//     */
//    private static void show(Comparable[] a) {
//        for (int i = 0; i < a.length; i++)
//            System.out.print(a[i] + " ");
//        System.out.println();
//    }
//
//    //判断是否排序成功
//    private static boolean isSorted(Comparable[] a) {
//        for (int i = 0; i < a.length; i++)
//            if (less(a[i], a[i - 1])) return false;
//        return true;
//    }
//
//    /**
//     * 原地归并的抽象方法,改方法现将所有的元素复制到aux[]中，然后再归并到a[]中，方法在归并时（第二个for循环）
//     * 进行了4个判断:
//     * 左半边用尽（取右半边元素）
//     * 右半边用尽（取左边边元素）
//     * 右半边的当前元素小于左半边的当前元素（取右半边元素）
//     * 右半边的当前元素大于等于左半边的当前元素（取左半边的元素）
//     *
//     * @param a
//     * @param lo
//     * @param mid
//     * @param hi
//     */
//    public static void merge(Comparable[] a, int lo, int mid, int hi) {
//        //将a[lo..mid]和a[mid+1..hi]归并
//        int i = lo, j = mid + 1;
//        for (int k = lo; k <= hi; k++) //将a[lo..hi]复制到aux[lo..hi]
//            aux[k] = a[k];
//        for (int k = lo; k <= hi; k++) //归并回到a[lo..hi]
//            if (i > mid) a[k] = aux[j++];
//            else if (j > hi) a[k] = aux[i++];
//            else if (less(aux[j], aux[i])) a[k] = aux[j++];
//            else a[k] = aux[i++];
//    }
//
//    /**
//     * 快速排序切分
//     * @param a
//     * @param lo
//     * @param hi
//     * @return
//     */
//    private static int partition(Comparable[] a, int lo, int hi) {//将数组切分为a[lo..i-1],a[i],a[i+1..hi]
//        int i = lo, j = hi + 1;      //左右扫描指针
//        Comparable v = a[lo];        //切分元素
//        while (true) {//扫描左右,检查扫描是否结束并且交换元素
//            while (less(a[++i], v)) if (i == hi) break;
//            while (less(v, a[--j])) if (j == lo) break;
//            if (i >= j) break;
//            exch(a, i, j);
//        }
//        exch(a, lo, j); //将v=a[j]放入正确的位置
//        return j;       //将[lo..j-1]<=a[j]<=a[j+1..hi]
//    }
//
//    public static void main(String[] args) {
//        String[] a = null;
//        sort(a);
//        assert isSorted(a);
//        show(a);
//    }
//
//
//}
