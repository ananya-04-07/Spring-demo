package com.annotationspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class baseball implements coach {
    private fortuneservice myfor;
    //@Autowired
    //public baseball(fortuneservice myfor)
    //{
    //    this.myfor = myfor;
    //}
    @Autowired
    public void setMyfor(fortuneservice myfor)
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
        return myfor.myfortune();
    }
}
