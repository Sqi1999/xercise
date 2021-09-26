package com.mybatis.dome.demo.test.ThreadText;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 到计数器（计数器）
 */
public class CountDownLatchDemo implements Runnable{
//定义一个计数器
    static  final CountDownLatch countDownLatch=new CountDownLatch(3);
    static  final CountDownLatchDemo countDownLatchDemo=new CountDownLatchDemo();
    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(10)*1000);
            System.out.println("check complete");
            countDownLatch.countDown(); //通知完成一个任务
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec= Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            exec.submit(countDownLatchDemo);
        }
        //等待检查 全部完成执行主线程
        countDownLatch.await();
        //发送火箭
        System.out.println("Fire!");
        exec.shutdown();
    }
}
