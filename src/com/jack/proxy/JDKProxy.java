package com.jack.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;

public class JDKProxy {

      public static Object getPoxyObject(final Object c) {

            return Proxy.newProxyInstance(c.getClass().getClassLoader(), c.getClass().getInterfaces(),// JDK实现动态代理，但JDK实现必须需要接口

                        new InvocationHandler() {

                             public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                                    // TODO Auto-generated method stub

                                    Object reObj = null;

                                    System.out.print("you say: ");

                                    reObj = method.invoke(c, args);

                                    System.out.println(" [" + Calendar.getInstance().get(Calendar.HOUR) + ":"

                                                + Calendar.getInstance().get(Calendar.MINUTE) + " "

                                                + Calendar.getInstance().get(Calendar.SECOND) + "]");

                                    return reObj;

                              }

                        });

      }
      
}