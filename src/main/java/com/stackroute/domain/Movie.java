package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void displayActorDetails()
    {
        System.out.println(actor.toString());
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("This bean factory is " + beanFactory.toString());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("The name of the bean is "+ s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("The name of the application is  "+ applicationContext.getApplicationName());
    }
}
