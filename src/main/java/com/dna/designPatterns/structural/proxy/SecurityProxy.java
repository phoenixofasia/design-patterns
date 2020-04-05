package com.dna.designPatterns.structural.proxy;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@AllArgsConstructor
public class SecurityProxy implements InvocationHandler {

    Object obj;

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
