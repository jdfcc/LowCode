package com.jdfcc.lowcode;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description cglib动态代理
 * @DateTime 2023/12/5 10:16
 */

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

class TargetClass {
    void sendMessage() {
        System.out.println("发送了一条短信");
    }
}

public class MyInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, java.lang.reflect.Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Before method invocation");

        // 调用目标方法
        Object result = proxy.invokeSuper(obj, args);

        System.out.println("After method invocation");
        return result;
    }

    public static void main(String[] args) {
        // 创建Enhancer对象
        Enhancer enhancer = new Enhancer();

        // 设置目标类
        enhancer.setSuperclass(TargetClass.class);

        // 设置拦截器
        enhancer.setCallback(new MyInterceptor());

        // 生成代理类实例
        TargetClass proxy = (TargetClass) enhancer.create();

        // 调用代理类方法
        proxy.sendMessage();
    }
}
