package com.bridgelabz.oops.inbuiltfunction;

public class Product {
    private static double discount = 0.0;

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price per Unit: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Cost after Discount: ₹" + calculateTotalCost());
        }
    }

    public double calculateTotalCost() {
        double total = price * quantity;
        double discountedTotal = total - (total * discount / 100);
        return discountedTotal;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public static void main(String[] args) {
        Product.updateDiscount(10.0);

        Product p1 = new Product("P101", "Bluetooth Speaker", 1500.00, 2);
        Product p2 = new Product("P102", "Power Bank", 1200.00, 1);

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
    }
}