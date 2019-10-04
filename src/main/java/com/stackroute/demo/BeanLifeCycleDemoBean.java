package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {


    public void customInit()
    {
        System.out.println("Custom Initialization.....");
    }

    public void customDestroy()
    {
        System.out.println("Custom Destruction.....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties Set");
    }
}
