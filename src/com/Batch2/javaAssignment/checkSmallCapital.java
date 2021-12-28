/* 4.Write a program to check if inputted letter is small or capital */

package com.Batch2.javaAssignment;

import java.util.Scanner;

public class checkSmallCapital {
    public static void main(String[] args) {
        char letter;
        System.out.println("Input Character: ");
        Scanner input = new Scanner(System.in);
        letter = input.next().charAt(0);

        if((letter >=65)&&(letter <= 90)) {
            System.out.println(letter+ " is a Capital letter");
        }
        else if ((letter >=97)&&(letter <= 122)) {
            System.out.println(letter+ " is a Small letter");
        }
        else  {
            System.out.println(letter+ " is not a letter");
        }
    }
}
