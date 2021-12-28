/* 6.Write a program to check if the provided user credentials are valid during login */

package com.Batch2.javaAssignment;
import java.util.Scanner;

public class checkLogin {
    public static void main(String[] args) {
        String username = "shaon", password = "shaon1234", givenUserName, givenPassword;
        System.out.println("Input Username: ");
        Scanner input = new Scanner(System.in);
        givenUserName = input.next();
        System.out.println("Input password: ");
        givenPassword = input.next();

        if(username.equals(givenUserName) && password.equals(givenPassword)){
            System.out.println("LogIn successful!!");
        }
        else if (password.equals(givenPassword)) {
            System.out.println("Username is incorrect. LogIn denied!!");
        }
        else if(username.equals(givenUserName)){
            System.out.println("Password is incorrect. LogIn denied!!");
        }
        else {
            System.out.println("Username and Password are incorrect. LogIn denied!!");
        }
    }
}
