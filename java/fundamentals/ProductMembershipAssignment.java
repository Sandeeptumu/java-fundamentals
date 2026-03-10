package com.java.fundamentals;

import java.util.Scanner;

public class ProductMembershipAssignment {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Name Of The Customer: ");
        char name;
        name = scanner.next().charAt(0);

        System.out.println("Enter The phone Number Of The Customer: ");
        long number;
        number= scanner.nextLong();

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

        System.out.println("Name= " +name);
        System.out.println("Phone Number: "+number);
        System.out.println("Membership: "+membership);
        System.out.println("Age: "+age);

        if(membership =='S' || age>=50 ){
            System.out.println("Discount: 10% and Shipping Charges: ₹50 ");
            long discount = 10;
            discount = price*discount/100;
            System.out.println("Discount Amount: "+discount);

            long discountPrice;
            discountPrice = price-discount;
            System.out.println("Discount Price: "+discountPrice);

            long centalTaxAmount, CentalTax=(long)2.5;
            centalTaxAmount = CentalTax * discountPrice/ 100;
            System.out.println("centralTax: " + centalTaxAmount);

            long stateTaxAmounht, StateTax =(long)2.5;
            stateTaxAmounht = StateTax *discountPrice/100;;
            System.out.println("State Tax: "+ stateTaxAmounht);

            long finalPrice;
            finalPrice=discountPrice + stateTaxAmounht + centalTaxAmount;
            System.out.println("Final Price: "+finalPrice);

            long savedAmount;
            savedAmount=price-finalPrice;
            System.out.println("The Amount Saved On The Product: "+savedAmount);

            long finalbill;
            finalbill = (finalPrice*quantity)+50;
            System.out.println("The Final Bill With Shipping Charges: "+finalbill);

            long totalSavedMoney;
            totalSavedMoney = savedAmount*quantity;
            System.out.println("Total Saved Amount: "+savedAmount);


        } else if (membership =='G' || age>50) {
            System.out.println("Discount: 15% and Shipping Charges: ₹20 ");
            long discount = 15;
            discount = price*discount/100;
            System.out.println("Discount Amount: "+discount);

            long discountPrice;
            discountPrice = price-discount;
            System.out.println("Discount Price: "+discountPrice);

            long centalTaxAmount, CentalTax=(long)2.5;
            centalTaxAmount = CentalTax * discountPrice/ 100;
            System.out.println("centralTax: " + centalTaxAmount);

            long stateTaxAmounht, StateTax =(long)2.5;
            stateTaxAmounht = StateTax *discountPrice/100;;
            System.out.println("State Tax: "+ stateTaxAmounht);

            long finalPrice;
            finalPrice=discountPrice + stateTaxAmounht + centalTaxAmount;
            System.out.println("Final Price: "+finalPrice);

            long savedAmount;
            savedAmount=price-finalPrice;
            System.out.println("The Amount Saved On The Product: "+savedAmount);

            long finalbill;
            finalbill = (finalPrice*quantity)+20;
            System.out.println("The Final Bill With Shipping Charges: "+finalbill);

            long totalSavedMoney;
            totalSavedMoney = savedAmount*quantity;
            System.out.println("Total Saved Amount: "+savedAmount);


        } else if (membership == 'D'|| age>=50) {
            System.out.println("Discount: 20% and shipping Charges: ₹0 ");
            long discount = 20;
            discount = price*discount/100;
            System.out.println("Discount Ammount: "+discount);

            long discountPrice;
            discountPrice = price-discount;
            System.out.println("Discount Price: "+discountPrice);

            long centalTaxAmount, CentalTax=(long)2.5;
            centalTaxAmount = CentalTax * discountPrice/ 100;
            System.out.println("centralTax: " + centalTaxAmount);

            long stateTaxAmounht, StateTax =(long)2.5;
            stateTaxAmounht = StateTax *discountPrice/100;;
            System.out.println("State Tax: "+ stateTaxAmounht);

            long finalPrice;
            finalPrice=discountPrice + stateTaxAmounht + centalTaxAmount;
            System.out.println("Final Price: "+finalPrice);

            long savedAmount;
            savedAmount=price-finalPrice;
            System.out.println("The Amount Saved On The Product: "+savedAmount);

            long finalbill;
            finalbill = finalPrice*quantity;
            System.out.println("The Final Bill Is: "+finalbill);

            long totalSavedMoney;
            totalSavedMoney = savedAmount*quantity;
            System.out.println("Total Saved Amount: "+savedAmount);


        }else{
            System.out.println("Customer Dose Not Have Membership");
            long discount = 0;
            discount = 0;
            System.out.println("Discount Amount: "+discount);

            long discountPrice;
            discountPrice = price-discount;
            System.out.println("Discount Price: "+discountPrice);

            long centalTaxAmount, CentalTax=(long)2.5;
            centalTaxAmount = CentalTax * discountPrice/ 100;
            System.out.println("centralTax: " + centalTaxAmount);

            long stateTaxAmounht, StateTax =(long)2.5;
            stateTaxAmounht = StateTax *discountPrice/100;;
            System.out.println("State Tax: "+ stateTaxAmounht);

            long finalPrice;
            finalPrice=discountPrice + stateTaxAmounht + centalTaxAmount;
            System.out.println("Final Price: "+finalPrice);

            long savedAmount;
            savedAmount=price-finalPrice;
            System.out.println("The Amount Saved On The Product: "+savedAmount);

            long finalbill;
            finalbill = finalPrice*quantity;
            System.out.println("The Final Bill Is: "+finalbill);

            long totalSavedMoney;
            totalSavedMoney = savedAmount*quantity;
            System.out.println("Total Saved Amount: "+savedAmount);

        }
        scanner.close();
    }
}