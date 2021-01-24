package com.xiaoshitou.Draw;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class Jdbcdraw {
    private JdbcTemplate jdbcTemplate;

    private DataSource dataSource;


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public JdbcTemplate getJdbcTemplate() {
        if (jdbcTemplate==null){
            jdbcTemplate=jtl(dataSource);
        }
        return jdbcTemplate;
    }


    private JdbcTemplate jtl(DataSource dataSource) {
        return  new JdbcTemplate(dataSource);
    }


}
