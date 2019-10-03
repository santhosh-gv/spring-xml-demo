package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Task 3

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = applicationContext.getBean("movie",Movie.class);
        System.out.println("Autowire byName");
        movie.displayActorDetails();

        System.out.println();

//        Movie movie2 = applicationContext.getBean("movie2",Movie.class);
//        System.out.println("Autowire byType");
//        movie2.displayActorDetails();

        Movie movie2 = applicationContext.getBean("movie2",Movie.class);
        System.out.println("Removed Autowire byType and added constructor injection");
        movie2.displayActorDetails();

    }
}
