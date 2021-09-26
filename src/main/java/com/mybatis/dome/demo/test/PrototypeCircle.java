package com.mybatis.dome.demo.test;

import java.util.Scanner;

public class PrototypeCircle{


}
/**
 * 声明接口
 */
interface  Shape extends Cloneable {
    //复制的方法
    public Object clone();
    //计算面积
    public void countArea();
}
//圆
class Circle implements Shape{

    @Override
    public Object clone() {
        Circle circle=null;

        try {
            circle=(Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("失败");
            e.printStackTrace();
        }
        return circle;
    }

    @Override
    public void countArea() {
        int r=0;
        System.out.println("这是一个圆：请输入圆的半径");
        Scanner input=new Scanner(System.in);
        r=input.nextInt();
        System.out.println("圆的面积："+3.14*r*r+"\n");
    }
}

class Square implements Shape{

    @Override
    public Object clone() {
        Square square=null;
        try {
            square= (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("失败");
            e.printStackTrace();
        }
        return square;
    }

    @Override
    public void countArea() {
        int  h=0;
        System.out.println("这是一个正方形：请输入边长");
        Scanner input=new Scanner(System.in);
        h=input.nextInt();
        System.out.println("正方形面积："+h*4+"\n");
    }

}
class  ProtoTypeManager{

}

