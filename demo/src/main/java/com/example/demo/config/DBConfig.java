package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.Driver;
import java.sql.SQLException;

public class DBConfig {

    @Bean
    public DataSource dataSource() throws SQLException {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/newschema");
        dataSource.setUsername("admin");
        dataSource.setPassword("password");
        dataSource.setDriver(new Driver());
        return dataSource;
    }
}
