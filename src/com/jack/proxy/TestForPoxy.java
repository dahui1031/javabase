package com.jack.proxy;
public class TestForPoxy {

      public static void main(String[] args) {

            ServiceTest service = new ServiceTestImpl();

            System.out.println(service.getClass().getSimpleName());

            ServiceTest poxyService = (ServiceTest) JDKProxy.getPoxyObject(service);

            System.out.println(poxyService.getClass().getSuperclass());

            poxyService.saySomething("hello,My QQ code is 107966750.");

            poxyService.saySomething("what 's your name?");

            poxyService.saySomething("only for test,hehe.");

      }

}