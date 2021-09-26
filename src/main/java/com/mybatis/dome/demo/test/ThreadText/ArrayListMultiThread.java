package com.mybatis.dome.demo.test.ThreadText;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListMultiThread {
    static Vector<Integer> a1=new Vector<Integer>(10);
    public static  class  AddThread implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 1000000;   i++) {
                a1.add(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AddThread addThread=new AddThread();
        Thread t1=new Thread(addThread);
        Thread t2=new Thread(addThread);
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println(a1.size());
    }
}
