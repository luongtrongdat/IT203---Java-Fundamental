package com.session07;

public class Baitap05 {
    public static void main(String[] args){
        Config newConfig = new Config();

        System.out.println("max: " + newConfig.MAX_SCORE);
        System.out.println("max: " + newConfig.MIN_SCORE);

        // newConfig.MAX_SCORE = 999;
        // newConfig.MIN_SCORE = -999;
        // Lỗi 'Cannot assign a value to final variable'

    }
}
