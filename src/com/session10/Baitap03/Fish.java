package com.session10.Baitap03;

public class Fish extends Animal implements Swimmable{
    public Fish(String name) {
        super(name);
    }

    @Override
    public String swim() {
        return "Có thể bơi";
    }
}
