package com.test;

import java.util.Scanner;

class Animal {
    protected String animalName;
    protected int numberOfLegs;
    protected String furColor;
    protected double everageLifeExpectancy;

    public Animal() {
    }

    public Animal(String animalName, int numberOfLegs, String furColor, double everageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public double getEverageLifeExpectancy() {
        return everageLifeExpectancy;
    }

    public void setEverageLifeExpectancy(double everageLifeExpectancy) {
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten dong vat: ");
        this.animalName = sc.nextLine();
        System.out.print("Nhap so chan: ");
        this.numberOfLegs = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap mau long: ");
        this.furColor = sc.nextLine();
        System.out.print("Nhap tuoi tho trung binh: ");
        this.everageLifeExpectancy = Double.parseDouble(sc.nextLine());
    }

    public void display() {
        System.out.println("Ten: " + animalName);
        System.out.println("So chan: " + numberOfLegs);
        System.out.println("Mau long: " + furColor);
        System.out.println("Tuoi tho TB: " + everageLifeExpectancy);
    }
}

class Bird extends Animal {
    private boolean isFly;
    private String birdSound;

    public Bird() {
    }

    public Bird(String animalName, int numberOfLegs, String furColor, double everageLifeExpectancy, boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Co bay duoc khong (true/false): ");
        this.isFly = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Tieng hot: ");
        this.birdSound = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Kha nang bay: " + (isFly ? "Co" : "Khong"));
        System.out.println("Tieng hot: " + birdSound);
    }
}

class MamalAnimal extends Animal {
    private String foodType;
    private boolean isLiveWithHuman;
    private String mamalSound;

    public MamalAnimal() {
    }

    public MamalAnimal(String animalName, int numberOfLegs, String furColor, double everageLifeExpectancy, String foodType, boolean isLiveWithHuman, String mamalSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mamalSound = mamalSound;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }

    public String getMamalSound() {
        return mamalSound;
    }

    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Loai thuc an: ");
        this.foodType = sc.nextLine();
        System.out.print("Song voi nguoi (true/false): ");
        this.isLiveWithHuman = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Tieng keu: ");
        this.mamalSound = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Thuc an: " + foodType);
        System.out.println("Song voi nguoi: " + (isLiveWithHuman ? "Co" : "Khong"));
        System.out.println("Tieng keu: " + mamalSound);
    }
}

public class demo01 {
    public static void main(String[] args) {
        System.out.println("--- Nhap thong tin Chim ---");
        Bird bird = new Bird();
        bird.input();

        System.out.println("\n--- Nhap thong tin Thu ---");
        MamalAnimal mamal = new MamalAnimal();
        mamal.input();

        System.out.println("\n---------------------------------");
        System.out.println("Hien thi thong tin:");
        System.out.println("--- Chim ---");
        bird.display();
        System.out.println("\n--- Thu ---");
        mamal.display();
    }
}
