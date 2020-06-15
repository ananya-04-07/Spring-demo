package com.springdemo;

public class cricket implements coach{

    private fortuneservice fort;
    public cricket()
    {
        System.out.println("hello we are in constructor");
    }
    @Override
    public String myperformance() {
        return "everything is fine over here";
    }

    @Override
    public String getDailyForune() {
        return fort.Myfortue();
    }

    public void setFort(fortuneservice fort) {
        this.fort = fort;
    }
}
