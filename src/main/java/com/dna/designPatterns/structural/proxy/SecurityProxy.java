package com.dna.designPatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {

    Object obj;

    public SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader()
                , obj.getClass().getInterfaces()
                , new SecurityProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().contains("post")) {
            throw new IllegalAccessException("Post are not allowed currently");
        } else {
            return method.invoke(obj, args);
        }

    }
}
