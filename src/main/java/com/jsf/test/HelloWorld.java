package com.jsf.test;

import javax.faces.bean.ManagedBean;

/**
 * Created by nara007 on 16/1/12.
 */

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public HelloWorld()
    {
        System.out.println("hello world started...");
    }

    public String getMessage()
    {
        return "Hello World xiaoming";
    }
}
