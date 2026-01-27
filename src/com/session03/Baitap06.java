package com.session03;

import java.util.Scanner;

public class Baitap06 {
    public static Scanner sc = new Scanner(System.in);

    protected static int[] arrayFirst = {1,2,4,7,9};
    protected static int[] arraySecond = {0,1,3,5,7,9,11};

    public static int checkExist(int[] arr, int number){
        for(int e : arr){
            if(number == e){
                return 1;
            }
        }
        return 0;
    }
    public static int[] arrayMerge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i=0, k=0, j=0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                arr3[k++] = arr2[j++];
            } else {
                arr3[k++] = arr1[i];
                i++;
                j++;
            }
        }

        while (i < arr1.length){
            if(checkExist(arr3, arr1[i]) == 0){
                arr3[k++] = arr1[i];
            }
            i++;
        }
        while (j < arr2.length){
            if (checkExist(arr3, arr2[j]) == 0){
                arr3[k++] = arr2[j];
            }
            j++;
        }
        int[] result = new int[k];
        for(int a=0; a<k; a++){
            result[a] = arr3[a];
        }
        return result;
    }

    public static void displayArray(int[] arr){
        System.out.print("[");
        for (int i=0; i<arr.length; i++){
            if(i==0) {
                System.out.print(arr[i]);
            }else{
                System.out.print(", " + arr[i]);
            }

        }
        System.out.print("]");
    }

    public static void main(String[] args){
        int[] mergeArr = arrayMerge(arrayFirst, arraySecond);
        System.out.print("Kho cũ: ");
        displayArray(arrayFirst);
        System.out.print("\nLô mới: ");
        displayArray(arraySecond);
        System.out.print("\nKho tổng (đã được gộp & lọc trùng): ");
        displayArray(mergeArr);
    }
}
