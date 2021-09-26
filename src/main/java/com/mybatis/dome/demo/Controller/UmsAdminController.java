package com.mybatis.dome.demo.Controller;

import com.mybatis.dome.demo.server.Impl.UserServerImpl;
import com.mybatis.dome.demo.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("v1.1")
@RestController
public class UmsAdminController {

    @Autowired
    public UserServer userServer;

    @PostMapping("/t")
    public void a(){
        userServer.listAllBrand();
    }
}
