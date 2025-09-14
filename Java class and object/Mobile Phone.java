package com.bridgelabz.oops.levelone;

public class Mobile Phone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Model: " + model);
        System.out.println("Mobile Price: ₹" + price);
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 69999.00);
        phone1.displayDetails();
    }
}