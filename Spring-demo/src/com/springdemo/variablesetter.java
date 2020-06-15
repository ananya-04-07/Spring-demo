package com.springdemo;

import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.util.SortedSet;

public class variablesetter {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private int num;

    public void setNum(int num) {
        this.num = num;
    }
    public void getdetails()
    {
        System.out.println(num + " " +msg);
    }
}
