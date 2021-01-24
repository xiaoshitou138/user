package com.xiaoshitou.dao;

import com.xiaoshitou.domain.Account;

import java.util.List;

public interface AccountDao {

    List<Account> fanall();

    Account buid(Integer integer);

    Account bname(String name);


    void   baa(Account account);

}
