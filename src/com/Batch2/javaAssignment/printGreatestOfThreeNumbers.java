/*  2.Take three numbers from the user and print the greatest number */

package com.Batch2.javaAssignment;
import java.util.Scanner;

public class printGreatestOfThreeNumbers  {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number:");
        firstNumber = input.nextInt();
        System.out.print("Input second number:");
        secondNumber = input.nextInt();
        System.out.print("Input third number:");
        thirdNumber = input.nextInt();
        if ((firstNumber == secondNumber) && (secondNumber ==thirdNumber)){
            System.out.println("Three numbers are same");
        }
        else if((firstNumber > secondNumber) && (firstNumber > thirdNumber))
        {
            System.out.println("Largest number is:"+firstNumber);
        }
        else if(secondNumber > thirdNumber)
        {
            System.out.println("Largest number is:"+secondNumber);
        }
        else
        {
            System.out.println("Largest number is:"+thirdNumber);
        }
    }
}
