/* 1.Write a program to get a number from the user and print whether it is positive or
negative. */

package com.Batch2.javaAssignment;
import java.util.Scanner;

public class checkPositiveNegative {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check:");
        number = input.nextInt();
        if(number > 0)
        {
            System.out.println(number+" is a Positive number.");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a Negative number");
        }
        else
        {
            System.out.println(number+" is not Positive or Negative ");
        }
    }
}
