package com.java.fundamentals;

import java.util.Scanner;

public class StudentDataManagment {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll.NO: ");
        int RollNumber;
        RollNumber = scanner.nextInt();

        System.out.println("Enter The age: ");
        byte age;
        age = scanner.nextByte();

        System.out.println("Enter The Section: ");
        char Section;
        Section = scanner.next().charAt(0);

        System.out.println("Enter The Total Marks: ");
        int Marks;
        Marks = scanner.nextInt();

        System.out.println("Enter The Average Marks: ");
        float Avg_Marks;
        Avg_Marks = scanner.nextFloat();

        System.out.println("Enter The Year Of Joining: ");
        short YearOfJoining;
        YearOfJoining = scanner.nextShort();

        System.out.println("Enter the phone Number: ");
        long PhoneNumber;
        PhoneNumber = scanner.nextLong();

        System.out.println("Passed: ");
        boolean Passed;
        Passed = scanner.nextBoolean();

        System.out.println("---STUDENT DATA MANAGEMENT---");
        System.out.println("Roll Number: " +RollNumber);
        System.out.println("Age: " +age);
        System.out.println("Section " +Section);
        System.out.println("Total Marks: " +Marks);
        System.out.println("Average Marks; " +Avg_Marks);
        System.out.println("Year Of Joining: " +YearOfJoining);
        System.out.println("Mobile Number: " +PhoneNumber);
        System.out.println("Passed: " +Passed);

        scanner.close();
    }
}
