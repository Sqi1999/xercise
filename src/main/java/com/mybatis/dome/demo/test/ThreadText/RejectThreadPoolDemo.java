package com.mybatis.dome.demo.test.ThreadText;

import java.util.concurrent.*;

/**
 * 自定义线程池和拒绝策略
 */
public class RejectThreadPoolDemo {
    public static class MyTask implements  Runnable{


        @Override
        public void run() {
            System.out.println(System.currentTimeMillis()+":Thread ID:"+Thread.currentThread().getId());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//    public static void main(String[] args) {
//        MyTask mytask=new MyTask();
//        ExecutorService es=new ThreadPoolExecutor(5, 5,
//                0L, TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<Runnable>(10),
//                Executors.defaultThreadFactory(),
//                new RejectedExecutionHandler() {
//                    @Override
//                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
//                        System.out.println(r.toString()+"is discard");
//                    }
//                });
//
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            es.submit(mytask);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public static void main(String[] args) {
        MyTask task=new MyTask();
        ExecutorService es=new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(),
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        Thread t=new Thread();
                        t.setDaemon(true);
                        System.out.println("create:"+t);
                        return  t;
                    }
                }
        );
        for (int i = 0; i < 5; i++) {
            es.submit(task);
        }
    }
}
