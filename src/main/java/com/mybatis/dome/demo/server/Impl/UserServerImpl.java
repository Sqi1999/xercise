package com.mybatis.dome.demo.server.Impl;


import com.mybatis.dome.demo.Mapper.UmsAdminMapper;
import com.mybatis.dome.demo.entity.UmsAdmin;
import com.mybatis.dome.demo.server.UserServer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Repository
public class UserServerImpl implements UserServer {

//        public static void main(String[] args) throws IOException {
//            //从工具方法中获取 SqlSession
//            SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
//            ums_adminMapper umsadminMapper = sqlSession.getMapper(ums_adminMapper.class);
//            List<ums_admin> users = umsadminMapper.userList();
//            System.out.println(users);
//            sqlSession.commit();
//    }
@Autowired
private  static UmsAdminMapper umsAdminMapper;
    public UserServerImpl() throws IOException {
    }
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UmsAdminMapper mapper = sqlSession.getMapper(UmsAdminMapper.class);
        Long a= Long.valueOf(1);
        UmsAdmin umsAdmin = mapper.selectByPrimaryKey(a);
        System.out.println(umsAdmin);
//        System.out.println(umsAdminMapper.selectByPrimaryKey(a));
    }

    @Override
    public UmsAdmin listAllBrand() {
        Long a= Long.valueOf(1);
        return umsAdminMapper.selectByPrimaryKey(a);
    }
}
