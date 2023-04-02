package com.company.javafullcourse;

import java.time.LocalDate;
import java.util.Scanner;

public class Eg21ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        int dobYear = LocalDate.now().minusYears(age).getYear();
        System.out.println("Hello " + name + " you were born in year :" + dobYear);
    }
}
