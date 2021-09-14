package com.md;

public class EmployeeBean {

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init(){
        System.out.println("init is called from employee bean class");
    }
    public void destory(){
        System.out.println("destory caled  from employee bean class");
    }

}
