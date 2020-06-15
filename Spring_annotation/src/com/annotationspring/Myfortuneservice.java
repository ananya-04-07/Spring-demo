package com.annotationspring;

public class Myfortuneservice implements fortuneservice{

    @Override
        public String myfortune() {
        return "it's annotation method";
    }
}
