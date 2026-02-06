package com.session09.Baitap02_04;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, int numberOfLength, String furColor, double averageOfAge) {
        super(name, numberOfLength, furColor, averageOfAge);
    }

    @Override
    public void sound() {
        System.out.println("Meoww meoww");
    }
}
