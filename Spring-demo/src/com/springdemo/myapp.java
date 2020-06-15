package com.springdemo;

public class myapp {
    public static void main(String [] args) {
        fortuneservice fort = new Myfortuneservice();
        coach dta = new baseball(fort);
        coach dta1 = new mytrack(fort);
        System.out.println(dta.myperformance());
        System.out.print(dta1.myperformance());
    }
}
