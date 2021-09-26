package com.mybatis.dome.demo.test;

public class ImportCompany implements  Company {

    @Override
    public void response(int number) {
        if(number>0){
            System.out.println("number>0");
        }else{
            System.out.println("number<0");
        }
    }
}
