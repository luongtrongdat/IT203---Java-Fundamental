package com.session09.Baitap02_04;

public class Main04 {
    public static void main(String[] args){
        Animal animal = new Dog();

        // Gọi phương thức chung
        animal.sound();

        // Kiểm tra và ép kiểu về Dog để sử dụng phương thức riêng của dog
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.smell();
        }
    }
}
