/* 7.Write a program to sum of random numbers */

package com.Batch2.javaAssignment;

import java.util.Random;
import java.util.Scanner;

public class sumRandomNumbers {
    public static void main(String[] args) {
        int count, totalNumbers, sum = 0;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input the number of random numbers you want to generate:");
        totalNumbers = input.nextInt();

        for (count= 1; count <= totalNumbers; count++){
            sum += random.nextInt(100);
        }
        System.out.println("Sum of random numbers are: "+sum);
    }
}
