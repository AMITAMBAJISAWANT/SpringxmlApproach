package com.amit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
   
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
       //the SpringUsingxml.class  us used to to get the object of the SpringUsingxml type 
       SpringUsingXml obj= context.getBean("A1",SpringUsingXml.class);
       obj.code();

    //    SpringUsingXml obj2=(SpringUsingXml) context.getBean("A1");
    //    obj2.code();
    }
}
