package com.springdemo;

public class mytrack implements coach {
    private fortuneservice fort;
    public mytrack(fortuneservice fort)
    {
        this.fort = fort;
    }
    @Override
    public String myperformance()
    {
        return "ran around 5 km";
    }

    @Override
    public String getDailyForune() {
        return "just do it"+fort.Myfortue();
    }
}
