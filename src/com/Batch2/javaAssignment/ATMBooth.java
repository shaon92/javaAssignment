/* 8.Write a program to check balance and withdraw money from ATM booth using if else and
switch case */

package com.Batch2.javaAssignment;

import java.util.Scanner;

public class ATMBooth {
    public static void main(String[] args) {
        int cardNumber = 4004, pinNumber = 1234, givenCardNumber, givenPinNumber, choice, amount;
        double balance=5000;
        System.out.println("Input Card Number: ");
        Scanner input = new Scanner(System.in);
        givenCardNumber = input.nextInt();
        System.out.println("Input Pin Number: ");
        givenPinNumber = input.nextInt();

        if((cardNumber == givenCardNumber) && (pinNumber == givenPinNumber)){
            System.out.println("Access Granted!!");
            System.out.println("\t1. Check Balance\n\t2. Withdraw money\n\t3. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            while (choice != 3) {
                switch (choice) {
                    case 1:
                        System.out.println("Available balance is:" + balance);
                        break;

                    case 2:
                        System.out.println("Enter withdrawal amount: ");
                        amount = input.nextInt();
                        if(balance < amount) {
                            System.out.println("Insufficient balance");
                        }
                        else {
                            balance = balance - amount;
                            System.out.println("Withdrawal successful.");
                        }
                        break;

                    default:
                        break;
                }
                System.out.println("\t1. Check Balance\n\t2. Withdraw money\n\t3. Exit");
                System.out.println("Enter your choice: ");
                choice = input.nextInt();
            }
        }
        else if (pinNumber == givenPinNumber) {
            System.out.println("Card Number is incorrect. Access denied!!");
        }
        else if(cardNumber == givenCardNumber){
            System.out.println("PIN is incorrect. Access denied!!");
        }
        else {
            System.out.println("Card number and PIN are incorrect. Access denied!!");
        }
    }
}