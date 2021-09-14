package com.md;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentBean implements InitializingBean, DisposableBean {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy called from student bean");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init called  from Student bean class");

    }
}
