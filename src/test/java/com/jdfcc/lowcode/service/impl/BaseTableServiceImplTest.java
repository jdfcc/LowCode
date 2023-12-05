package com.jdfcc.lowcode.service.impl;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description TODO
 * @DateTime 2023/11/28 11:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class BaseTableServiceImplTest {

    @Resource
    BaseTableServiceImpl baseTableServiceImpl;
    @Test
    void createTable() {
        baseTableServiceImpl.createTable();
    }
}