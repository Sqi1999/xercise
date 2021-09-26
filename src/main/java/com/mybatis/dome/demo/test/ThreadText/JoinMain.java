package com.mybatis.dome.demo.test.ThreadText;

public class JoinMain {
    public volatile  static  int i=0;
    public volatile int j=0;
    public static  class AndThread extends Thread{
        @Override
        public void run() {
            for ( i = 0; i < 1000000; i++) {
            }
        }

        public static void main(String[] args) throws InterruptedException {
            AndThread at=new AndThread();
            at.start();
            at.join();
            System.out.println(i);
        }
    }

    public static  class PlusTask implements  Runnable{

        @Override
        public void run() {
            for (int k = 0; k < 10000000; k++) {
             i++;
            }
        }

        public static void main(String[] args) throws InterruptedException {

                Thread threads1=new Thread(new PlusTask());
            Thread threads2=new Thread(new PlusTask());
            threads1.start(); threads2.start();
                threads1.join();threads2.join();


            System.out.println(i);
        }
    }


}
