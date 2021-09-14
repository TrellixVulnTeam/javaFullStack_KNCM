package com.md;

public class EmployeeRef {
    private  int id;
    private  String name;
    private  Address address;


    public EmployeeRef(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeRef{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
