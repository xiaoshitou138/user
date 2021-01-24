package com.xiaoshitou.dao.Impl;

import com.xiaoshitou.Draw.Jdbcdraw;
import com.xiaoshitou.dao.AccountDao;
import com.xiaoshitou.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoImpl  extends Jdbcdraw implements AccountDao {



    public List<Account> fanall() {
        List<Account> query = super.getJdbcTemplate().query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        return query;
    }
    public Account buid(Integer integer) {
        List<Account> query = super.getJdbcTemplate().query("select * from account WHERE id=?", new BeanPropertyRowMapper<Account>(Account.class),integer);
        return  query.isEmpty()?null:query.get(0);
    }

    public Account bname(String name) {
        List<Account> query = super.getJdbcTemplate().query("select * from account WHERE name=?", new BeanPropertyRowMapper<Account>(Account.class),name);
           if (query.isEmpty()){
               return  null;
           }
           if (query.size()>1){
               throw  new RuntimeException("结果集不为一");
           }

        return query.get(0);
    }

    public void baa(Account account) {
        super.getJdbcTemplate().update("INSERT INTO account(name,money)VALUES (?,?)",account.getName(),account.getMoney());
    }
}
