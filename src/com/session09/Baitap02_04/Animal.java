package com.session09.Baitap02_04;

public class Animal {
    public String name;
    public int numberOfLength;
    public String furColor;
    public double averageOfAge;

    public Animal() {
    }

    public Animal(String name, int numberOfLength, String furColor, double averageOfAge) {
        this.name = name;
        this.numberOfLength = numberOfLength;
        this.furColor = furColor;
        this.averageOfAge = averageOfAge;
    }

    public void sound(){
        System.out.println("Con vật đang kêu: ");
    }
}
