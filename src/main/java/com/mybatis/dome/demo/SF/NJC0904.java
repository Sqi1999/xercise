package com.mybatis.dome.demo.SF;

/**
 * 同分异构体
 */
public class NJC0904 {
    public static void main(String[] args) {
        String a="aaa";
        String s="kihjhjhkkk";
        int tg = isTG(a,s);
        System.out.println(tg);

    }
    private static int isTG(String a,String s){
        char [] aim=a.toCharArray();
        int [] count=new int[256];
        for (int i = 0; i < aim.length; i++) {
            count[aim[i]]++;
        }
        int M=aim.length; //记录窗口长度
        char [] str=s.toCharArray();
        int inValidTimes=0;
        int R=0;
        for (; R <M ; R++) {
            //count当前str[R]坐标--，如果--之前小于等于0那么将 inValidTime+1;
            if (count[str[R]]--<=0){
                inValidTimes++;
            }
        }
        //当前R==aim.length
        for (; R <str.length ; R++) {
            if (inValidTimes==0){
                return R-M; //返回起始位置
            }
            if (count[str[R]]--<=0){
                inValidTimes++;
            }
            if (count[str[R-M]]++<0){
                inValidTimes--;
            }
        }
        return inValidTimes==0?R-M:-1;
    }



}
