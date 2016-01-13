package com.jsf.test;

import org.jboss.seam.annotations.Name;

/**
 * Created by nara007 on 16/1/13.
 */
@Name("seamBean")
public class SeamBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("dayinle...");
        this.name = name;
    }
}
