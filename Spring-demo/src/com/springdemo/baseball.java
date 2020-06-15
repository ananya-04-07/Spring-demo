package com.springdemo;

public class baseball implements coach {
    private fortuneservice myfor;
    public baseball(fortuneservice myfor)
    {
        this.myfor = myfor;
    }
    @Override
    public String myperformance()
    {
      return "done";
    }

    @Override
    public String getDailyForune() {
        return myfor.Myfortue();
    }
}
