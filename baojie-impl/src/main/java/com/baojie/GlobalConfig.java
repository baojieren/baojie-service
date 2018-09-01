package com.baojie;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

//@Configuration
public class GlobalConfig {

    //@Bean
    //@ConfigurationProperties(prefix = "baojie")
    public DataSource dataSource() {
        return new DruidDataSource();
    }
}
