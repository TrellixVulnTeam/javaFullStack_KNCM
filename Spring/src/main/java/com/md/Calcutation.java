package com.md;

public class Calcutation {
    private int a;
    private int b;

    public Calcutation(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public Calcutation(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
    }

    public Calcutation(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
    }


    public  void sum(){
        System.out.println("Sum :" +(this.a+this.b));
    }
    public  void sub(){
        System.out.println("Sum :" +(this.a-this.b));
    }
}
