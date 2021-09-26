package com.mybatis.dome.demo.test.ThreadText;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterLock implements  Runnable {
    //设置重入锁
    public static ReentrantLock lock=new ReentrantLock();
    public  static  int i=0;
    @Override
    public void run() {
        for (int j = 0; j <10000000; j++) {
            lock.lock();//开锁  //可以开多个锁，但是关锁要设置同样多个
            lock.lock();
            try{
            i++;}finally {
                lock.unlock(); //关锁
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLock reenterLock=new ReenterLock();
        Thread t1=new Thread(reenterLock);
        Thread t2=new Thread(reenterLock);
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println(i);
    }
}
