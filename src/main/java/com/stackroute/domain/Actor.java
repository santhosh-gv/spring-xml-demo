package com.stackroute.domain;

public class Actor {

    private String name;
    private String gender;
    private int age;

    public Actor() {
    }

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int compareActor(Actor a)
    {
        if(this.name==a.name && this.age == a.age && this.gender == a.gender)
        {
            return 1;
        }
        else
            return 0;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
