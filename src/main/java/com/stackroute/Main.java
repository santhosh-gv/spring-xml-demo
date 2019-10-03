package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = applicationContext.getBean("movie",Movie.class);
        System.out.println("Using Application Context");
        movie.displayActorDetails();

        System.out.println();

        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/resources/beans.xml"));
        Movie beanObj= (Movie) beanFactory.getBean ("movie");
        System.out.println("Using Bean Factory");
        beanObj.displayActorDetails();

        System.out.println();

        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie mov = (Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie");
        System.out.println("Using BeanDefinitionRegistry and BeanDefinitionReader");
        mov.displayActorDetails();

        System.out.println();
        System.out.println("Task 2");
        System.out.println();
        //Task  2

        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie2 = applicationContext1.getBean("mankatha",Movie.class);
       // System.out.println("Using Application Context");
        movie2.displayActorDetails();

        System.out.println();
        Movie movie2again = applicationContext1.getBean("mankatha",Movie.class);
       // System.out.println("Using Application Context");
        movie2again.displayActorDetails();

        System.out.println();
        Movie movie2a = applicationContext1.getBean("sarkar",Movie.class);
       // System.out.println("Using Application Context");
        movie2a.displayActorDetails();
        System.out.println();

        Movie movie2b = applicationContext1.getBean("arjun reddy",Movie.class);
     //   System.out.println("Using Application Context");
        movie2b.displayActorDetails();
        System.out.println();

        movie2.compareMovie(movie2again);

        System.out.println();

        System.out.println("Checking for multiple movie names");

        Movie movie2t = applicationContext1.getBean("taxiwaala",Movie.class);
     //   System.out.println("Using Application Context");
        movie2t.displayActorDetails();
    }
}
