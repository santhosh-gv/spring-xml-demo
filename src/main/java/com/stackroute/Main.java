package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

        //Task 6

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifeCycleDemoBean movie2 = applicationContext.getBean("beanPostProcessor",BeanLifeCycleDemoBean.class);

    }
}
