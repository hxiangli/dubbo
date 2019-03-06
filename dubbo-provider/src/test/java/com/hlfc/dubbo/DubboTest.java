package com.hlfc.dubbo;
  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class DubboTest { 
    public static void main( String[] args ) throws Exception  
    {  
        ClassPathXmlApplicationContext context=  
                new ClassPathXmlApplicationContext(new String[] {"conf/integrated-spring-config.xml"});  
        context.start();  
        System.out.println("任意键退出");  
        System.in.read();  
    }  
}  
