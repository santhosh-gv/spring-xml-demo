package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie {

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


}
