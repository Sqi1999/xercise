package com.mybatis.dome.demo.SF;

import java.util.Stack;

public class Logarithmic {
    public static int [] genrateRandomArray(int maxSize,int maxValue){
        //Math.random() [0,1)   小数
        //Math.random()*N   [0,N) 小数
        //(int)(Math.random()*N)  [0-N-1]  整数
        int [] arr=new int[(int)((maxSize+1)*Math.random())];
        for (int i = 0; i < arr.length; i++) {
            //- 有负数
            arr[i]=(int)((maxValue+1)*Math.random())-(int)(maxValue*Math.random());
        }
        return  arr;
    }


    public static void show(int []a){
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }


    /**
     * /取整  %取余数
     * @param x
     * @return
     */
    public static int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }


    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println(reverse);
                System.out.println(964632435*10);
        //        System.out.println(1%10);
        //        System.out.println(964632435*10);

    }
}
