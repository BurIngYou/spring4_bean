package com.burning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: main
 * @Author:You.Hu
 * @Create:2017-03-29 20:40
 */
public class Main {

    public static void main(String [] args){

        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayAction("说一句话！"));

    }
}
