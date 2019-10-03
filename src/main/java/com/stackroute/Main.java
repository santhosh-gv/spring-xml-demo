package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

        //Task 5

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifeCycleDemoBean movie2 = applicationContext.getBean("beanLifecycle",BeanLifeCycleDemoBean.class);
        //System.out.println("Removed Autowire byType and added constructor injection");
        movie2.afterPropertiesSet();
        movie2.destroy();
        movie2.customInit();
        movie2.customDestroy();



    }
}
