package com.java.fundamentals;

import java.util.Scanner;

public class ProductMembershipAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The ID Of The Customer: ");
        short id;
        id = scanner.nextShort();

        System.out.println("Enter The phone Number Of The Customer: ");
        long number;
        number = scanner.nextLong();

        System.out.println("Enter The Product Price: ");
        long price;
        price = scanner.nextLong();

        System.out.println("Enter The Membership: ");
        char membership;
        membership = scanner.next().charAt(0);

        System.out.println("Enter Quantity: ");
        long quantity;
        quantity = scanner.nextLong();

        System.out.println("Enter Age Of The Customer: ");
        int age;
        age = scanner.nextInt();


        int discountPercentage;

        if (membership == 'S' && age >= 25) {
            discountPercentage = 10;
        } else if (membership == 'G' && age >= 40) {
            discountPercentage = 15;
        } else if (membership == 'D' && age >= 55) {
            discountPercentage = 20;
        }
        else
            discountPercentage = 0;
        long discountAmount;
        discountAmount = price * discountPercentage/100;
        long discountPrice;
        discountPrice = price - discountAmount;
        double stateTax;
        stateTax = 2.5;
        long stateTaxAmount;
        stateTaxAmount = (long) (discountAmount * stateTax) /100;
        double centralTax;
        centralTax = 2.5;
        long centralTaxAmount;
        centralTaxAmount = (long)(discountAmount * centralTax)/100;
        long finalPrice;
        finalPrice = discountPrice + centralTaxAmount + stateTaxAmount;
        long savedAmount;
        savedAmount = price - finalPrice;
        long finalBill;
        finalBill = finalPrice * quantity;
        long totalAmountSaved;
        totalAmountSaved = savedAmount * quantity;

        System.out.println("Name= " +id);
        System.out.println("Phone Number: " + number);
        System.out.println("Membership: " + membership);
        System.out.println("Age: " + age);
        System.out.println("Discount Percentage: " +discountPercentage);
        System.out.println("Discount Amount: "+discountAmount);
        System.out.println("DisCount Price: " +discountPrice);
        System.out.println("State Tax: " +stateTaxAmount);
        System.out.println("Central Tax: "+centralTaxAmount);
        System.out.println("final Price: " +finalPrice);
        System.out.println("Amount Saved: "+savedAmount);
        System.out.println("final Bill: "+finalBill);
        System.out.println("Total Amount Saved: "+totalAmountSaved);
        scanner.close();
    }
}