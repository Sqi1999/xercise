package com.mybatis.dome.demo.test.ThreadText;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static class Soldier implements  Runnable{

        private String soldier;

        private  final CyclicBarrier cyclic;

        public Soldier(CyclicBarrier cyclic,String soldierName) {
            this.cyclic=cyclic;
            this.soldier=soldierName;
        }

        @Override
        public void run() {
            try {
                //等待所有到齐
                cyclic.await();
                Work();
                //等待所有完成
                cyclic.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }

        void Work(){
            try {
                Thread.sleep(Math.abs(new Random().nextInt()%10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(soldier+":任务完成");
        }
    }

    public  static  class  BarrierRun implements  Runnable{
        boolean flag;
        int N;

        BarrierRun(boolean flag,int N){
            this.flag=flag;
            this.N=N;
        }
        @Override
        public void run() {
            if(flag){
                System.out.println("司令：[士兵"+N+"个，完成任务！");
            }else{
                System.out.println("司令：[士兵"+N+"个，集合完毕！");
                flag=true;
            }
        }
    }

    public static void main(String[] args) {
        final  int N=10;
        Thread [] allSoldier= new Thread[N];
        boolean flag=false;
        CyclicBarrier cyclic=new CyclicBarrier(N,new BarrierRun(flag,N));
        //设置屏障带你，为了执行这个方法
        System.out.println("集合");
        for (int i = 0; i < N; i++) {
            System.out.println("士兵"+i+"报道！");
            allSoldier[i]=new Thread(new Soldier(cyclic,"士兵"+i));
            allSoldier[i].start();
            
        }
    }
}
