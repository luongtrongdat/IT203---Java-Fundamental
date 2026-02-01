package com.session06;

public class Baitap03 {
    public static void main(String[] args){
        Product product = new Product("P001", "Laptop DELL core intel", 15000000);
        product.showProductInfo();
        // set lại với giá không hợp lệ
        product.setPrice(-20000000);
        product.showProductInfo();
    }
}
