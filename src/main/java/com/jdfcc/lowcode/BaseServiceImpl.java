package com.jdfcc.lowcode;

import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {
    @Override
    public void send() {
        // c 接口的 send 方法的实现
        System.out.println("d接口");
    }
}
