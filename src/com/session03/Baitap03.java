package com.session03;

import java.util.Scanner;

public class Baitap03 {
    public static Scanner sc = new Scanner(System.in);

    public static String[] names = {"Book 1", "Lão Hạc", "Book 2", "Tắt đèn", "Book 3"};
    public static int[] quantities = {7,5,3,7,6};

    public static void maxQuantityOfBooks(String[] names, int[] quantities){
        int maxQuantity = quantities[0];
        for (int i=0; i<quantities.length; i++){
            if(quantities[i]>maxQuantity) {
                maxQuantity = quantities[i];
            }
        }
        System.out.println("Sách có số lượng nhiều nhất (" + maxQuantity + ")" + ": ");
        for(int i =0; i< quantities.length; i++){
            if(quantities[i] == maxQuantity){
                System.out.println("- " + names[i]);
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities){
        int minQuantity = quantities[0];
        for (int i=0; i<quantities.length; i++){
            if(quantities[i]<minQuantity) {
                minQuantity = quantities[i];
            }
        }
        System.out.println("Sách có số lượng ít nhất (" + minQuantity + ")" + ": ");
        for(int i =0; i< quantities.length; i++){
            if(quantities[i] == minQuantity){
                System.out.println("- " + names[i]);
            }
        }
    }

    public static void main(String[] args){
        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }

}
