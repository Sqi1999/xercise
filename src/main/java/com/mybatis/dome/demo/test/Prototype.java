package com.mybatis.dome.demo.test;

/**
 * 原型模式
 * 在有些系统中，存在大量相同或相似对象的创建问题，如果用传统的构造函数来创建对象，会比较复杂且耗时耗资源，用原型模式生成对象就很高效，就像孙悟空拔下猴毛轻轻一吹就变出很多孙悟空一样简单。
 */
public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        citation c = new citation("樊振东", "进入", "决赛");
        c.display();
        citation c1 = (citation) c.clone();
        c1.setName("马龙");
        c1.display();
    }
}
 class citation implements Cloneable{
    String name;
    String info;
    String college;
    citation(String name,String info,String college){
        this.name=name;
        this.info=info;
        this.college=college;
//        System.out.println("创建成功");
    }
      String getName() {
         return (this.name);
     }
      void setName(String name) {
         this.name = name;
     }
     void display(){
         System.out.println(name+info+college);
     }
     public Object clone() throws CloneNotSupportedException {
//         System.out.println("拷贝成功");
         return (citation)super.clone();
     }
 }