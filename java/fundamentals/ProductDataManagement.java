package com.java.fundamentals;

import java.util.Scanner;

public class ProductDataManagement {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Product ID: ");
        int productId;
        productId = scanner.nextInt();

        System.out.println("Enter The Category Code: ");
        char categaryCode;
        categaryCode = scanner.next().charAt(0);

        System.out.println("Enter The Quantity: ");
        short quantity;
        quantity = scanner.nextShort();

        System.out.println("Enter The Unit Price: ");
        double unitPrice;
        unitPrice = scanner.nextDouble();

        System.out.println("Enter The Discount Percentage: ");
        float discount;
        discount = scanner.nextFloat();

        System.out.println("Enter The Supplier Contact Number: ");
        long number;
        number = scanner.nextLong();

        System.out.println("Is Product Available: ");
        boolean available;
        available = scanner.nextBoolean();

        System.out.println("Enter The Product Rating: ");
        byte rating;
        rating = scanner.nextByte();;

        System.out.println("Product ID: " +productId);
        System.out.println("Category Code: " +categaryCode);
        System.out.println("Quantity: " +quantity);
        System.out.println("Price: " +unitPrice);
        System.out.println("Discount: " +discount);
        System.out.println("Supplier Contact Number: " +number);
        System.out.println("Is Product Available" +available);
        System.out.println("Product Rating: " +rating);

        scanner.close();
    }
}
