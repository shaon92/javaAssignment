/* 3.Write a program that takes a year from user and print whether that year is a leap
year or not */

package com.Batch2.javaAssignment;

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Input Year: ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
