package com.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName AccountServiceTest
 * @Description TODO
 * @Author 23097
 * @Data 2022/9/11 12:01
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("阿尔萨斯");
        account.setMoney(999.99d);
        accountService.save(account);
    }
}
