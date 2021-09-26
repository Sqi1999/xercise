package com.mybatis.dome.demo.test.SHU;

import java.util.concurrent.atomic.LongAccumulator;

public class One {
    public static void main(String[] args) {
        String s="1";
        s.equals(s);//true

    }


    public  static void isPrint(String s){
        String base=s.substring(0,s.indexOf("."));
        String extrnsion=s.substring(s.indexOf(".")+1,s.length());
    }

    //回文
    public static  boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N / 2; i++)
            if (s.charAt(i) != s.charAt(N - 1 - i))
                return false;
            return true;

    }
    public static  long F(int N){
        if (N==0) return 0;
        if (N==1) return 1;
        return  F(N-1)+F(N-2);
    }

    public static  int mystery(int a,int b){
        if(b==0)return 1;
        if (b%2==0) return  mystery(a*a,b/2);
        return mystery(a*a,b/2)*a;
    }
    public static String exR1(int n){
        if (n<=0)return "";
        return  exR1(n-3)+n+exR1(n-2)+n;
    }

    //计算绝对值
    public static int absint(int x) {
        if (x < 0) return -x;
        else return x;
    }

    //计算一个浮点数的绝对值
    public static double absDouble(double x) {
        if (x < 0.0) return -x;
        else return x;
    }
//判断一个数是否是素数
    public static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i * i < N; i++)
            if (N % i == 0) return false;
            return true;
    }
//计算平方根
    public static  double sqrt(double c){
        if(c<0) return Double.NaN;
        double err=1e-15;
        double t=c;
        while (Math.abs(t-c/t)>err*t)
            t=(c/t+t)/2.0;
        return  t;
    }
    //计算直角三角形的斜边
    public static  double hypoenuse(double a,double b){
        return  Math.sqrt(a*a+b*b);
    }

}
