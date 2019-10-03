package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

        //Task 5

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        BeanPostProcessorDemoBean movie2 = applicationContext.getBean("beanPostProcessor", BeanPostProcessorDemoBean.class);
        //System.out.println("Removed Autowire byType and added constructor injection");
        movie2.postProcessBeforeInitialization("beanPostProcessor","postProcessor");
        movie2.postProcessAfterInitialization("beanPostProcessor","postProcessor");
        
    }
}
