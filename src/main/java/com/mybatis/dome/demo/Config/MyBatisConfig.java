package com.mybatis.dome.demo.Config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.mybatis.dome.demo.Mapper")
public class MyBatisConfig {
}
