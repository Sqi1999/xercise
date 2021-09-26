package com.mybatis.dome.demo.test;

public class President {

    public static void main(String[] args) {
//        Singleton si1=Singleton.getSingleton("China");

        Singleton2 s2=Singleton2.getSingleton2();
        Singleton2 s3=Singleton2.getSingleton2();
    }
}

      class  Singleton{
        public static volatile Singleton singleton=null;

        private Singleton(String name){
            System.out.println("乒乓球女子单打冠军是"+name);
        }
        public static  synchronized  Singleton getSingleton(String name){
            if(singleton==null){
                singleton=new Singleton(name);
            }else{
                System.out.println("冠军不能再次产生");
            }
            return singleton;
        }

    }

class Singleton2{
    private  static  final  Singleton2 singleton2=new Singleton2();

    private Singleton2(){
        System.out.println("乒乓球女子单打冠军是");
    }
    public static Singleton2 getSingleton2(){
        return  singleton2;
    }
}



//private static final President president=new President();
//private  President(){};
//public static President getPresident(){
//    return president;
//}


