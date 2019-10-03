package com.stackroute.domain;

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
    public void compareMovie(Movie a)
    {
        int flag = this.actor.compareActor(a.actor);
        if(flag == 1)
        {
            System.out.println("beanA==beanB");
        }
        else {
            System.out.println("beanA!=beanB");
        }
    }
}
