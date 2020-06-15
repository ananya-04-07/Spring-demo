package com.tutorialpackage;

public class helloone {

    private String message;
    private int num;

    public void setMessage(String message) {
        this.message = message;
    }
    public void setNum(int num)
    {
        this.num = num;
    }
    public void getMessage() {
        num = num+5;
        System.out.println("Your Message : " + message + num);

    }
    public void initial()
    {
        System.out.println("yey we have started");
    }
    public void destroyed()
    {
        System.out.println("we eneded");
    }
}
