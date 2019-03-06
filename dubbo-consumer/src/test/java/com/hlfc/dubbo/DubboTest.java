package com.hlfc.dubbo;

import org.dubbo.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class DubboTest {  
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(    
        new String[] {"conf/integrated-spring-config.xml"});  
        context.start();  
        TestService demoService=(TestService) context.getBean("testService");  
        System.out.println(demoService.sayHello("world"));  
        System.out.println(demoService.sayHello2("world"));  
   }    
}  