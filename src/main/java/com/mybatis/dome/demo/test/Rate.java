package com.mybatis.dome.demo.test;

import java.util.ArrayList;
import java.util.List;

abstract class Rate {
    protected List<Company> companys = new ArrayList<Company>();

    //添加观察者

    public void add(Company company){
        companys.add(company);
    }

    //删除观察者

    public void remove(Company company){
        companys.remove(company);
    }


}
