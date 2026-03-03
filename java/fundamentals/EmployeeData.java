package com.java.fundamentals;

import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter EmployeeId: ");
        int EmployeeId;
        EmployeeId = scanner.nextInt();

        System.out.println("Enter EmployeeAge: ");
        byte age;
        age = scanner.nextByte();

        System.out.println("The DepartmentCode is: ");
        char DepartmentCode;
        DepartmentCode = scanner.next().charAt(0);

        System.out.println("The Monthly Salary is: ");
        double MonthlySalary;
        MonthlySalary = scanner.nextDouble();

        System.out.println("Enter the no.of years experience:  ");
        short YearsOfExperience;
        YearsOfExperience = scanner.nextShort();

        System.out.println("Enter The phone Number: ");
        long PhoneNumber;
        PhoneNumber = scanner.nextLong();

        System.out.println("IS Employee Permanent: ");
        boolean IsPermanentEmployee;
        IsPermanentEmployee = scanner.nextBoolean();

        System.out.println("Rating: ");
        float Rating;
        Rating = scanner.nextFloat();

        System.out.println("---EMPLOYEE DETAILES---");
        System.out.println("Employee ID: " +EmployeeId);
        System.out.println("Age: " +age);
        System.out.println("Department Code : "  +DepartmentCode);
        System.out.println("Monthly Salary: " +MonthlySalary);
        System.out.println("Years Of Experience: " +YearsOfExperience);
        System.out.println("Permanent: " +IsPermanentEmployee);
        System.out.println("Rating: " +Rating);
        scanner.close();
    }
}
