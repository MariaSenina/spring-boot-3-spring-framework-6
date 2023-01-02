package com.senina.maria.springbasicsdemo.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        // try with resources
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address2"));
            System.out.println();

            System.out.println("Method call:");
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println();

            System.out.println("Parameter:");
            System.out.println(context.getBean("person3Parameters"));
            System.out.println();

            System.out.println("Qualifier:");
            System.out.println(context.getBean("person4Qualifier"));
            System.out.println();

            System.out.println("Type:");
            System.out.println(context.getBean(Address.class));
            System.out.println();


            System.out.println("All Spring Beans:");
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
