package com.jdfcc.lowcode;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description jdk动态代理
 * @DateTime 2023/12/4 11:13
 */


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface debug extends MethodInterceptor {
    @Override
    Object intercept(Object obj, java.lang.reflect.Method method, Object[] args, MethodProxy proxy) throws Throwable;

}

// 定义接口
interface MyInterface {
    void doSomething();

    void anotherTask();
}

// 实现 InvocationHandler 接口
class MyInvocationHandler implements InvocationHandler {
    private final Object realObject;

    public MyInvocationHandler(Object realObject) {
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method execution");
        Object result = method.invoke(realObject, args);
        String name = method.getName();
        System.out.println("当前方法名为" + name);
        System.out.println("After method execution");
        return result;
    }
}

public class DynamicProxyExample {
    public static void main(String[] args) {
        // 创建实际对象
        MyInterface realObject = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Doing something...");
            }

            @Override
            public void anotherTask() {
                System.out.println("Another Task...");
            }
        };

        // 创建动态代理
        MyInterface proxyObject = (MyInterface) Proxy.newProxyInstance(
                MyInterface.class.getClassLoader(),
                new Class[]{MyInterface.class},
                new MyInvocationHandler(realObject)
        );

        // 通过代理调用方法
        proxyObject.doSomething();
        proxyObject.anotherTask();
    }
}
