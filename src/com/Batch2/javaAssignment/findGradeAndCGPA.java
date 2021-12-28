/* 5.Write a program to calculate CGPA and find grade */

package com.Batch2.javaAssignment;
import java.util.Scanner;

public class findGradeAndCGPA {
    public static void main(String[] args) {

        int numbers[] =new int[20];
        int count, totalSubjects;
        double cgpa, gpa = 0;
        boolean failFlag = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Input total number of subjects: ");
        totalSubjects = input.nextInt();
        System.out.println("Input marks obtained in each subject: ");

        for (count = 0; count < totalSubjects; count++){
            numbers[count] = input.nextInt();
            if(numbers[count] >= 80 && numbers[count] <=100){
                System.out.println("Grade obtained A+");
                gpa = gpa + 4;
            }
            else if(numbers[count] >= 75 && numbers[count] < 80){
                System.out.println("Grade obtained A");
                gpa = gpa + 3.75;
            }
            else if(numbers[count] >= 70 && numbers[count] < 75){
                System.out.println("Grade obtained A-");
                gpa = gpa + 3.50;
            }
            else if(numbers[count] >= 65 && numbers[count] < 70){
                System.out.println("Grade obtained B+");
                gpa = gpa + 3.25;
            }
            else if(numbers[count] >= 60 && numbers[count] < 65){
                System.out.println("Grade obtained B");
                gpa = gpa + 3.00;
            }
            else if(numbers[count] >= 55 && numbers[count] < 60){
                System.out.println("Grade obtained B-");
                gpa = gpa + 2.75;
            }
            else if(numbers[count] >= 50 && numbers[count] < 55){
                System.out.println("Grade obtained C+");
                gpa = gpa + 2.50;
            }
            else if(numbers[count] >= 45 && numbers[count] < 50){
                System.out.println("Grade obtained C");
                gpa = gpa + 2.25;
            }
            else if(numbers[count] >= 40 && numbers[count] < 45){
                System.out.println("Grade obtained D");
                gpa = gpa + 2.00;
            }
            else if(numbers[count] >= 0 && numbers[count] < 40){
                System.out.println("Grade obtained F");
                gpa = gpa + 0;
                failFlag = true;
            }
            else {
                System.out.println("Wrong Input");
                gpa = gpa + 0;
            }
        }

        if (failFlag == false) {
            cgpa = gpa / totalSubjects;
        }
        else  {
            cgpa = 0;
        }

        System.out.println("\nCalculated CGPA: "+String.format("%.2f",cgpa));
        if(cgpa == 4){
            System.out.println("Final Grade obtained A+\n");
        }
        else if(cgpa >=3.75 && cgpa < 4) {
            System.out.println("Final Grade obtained A\n");
        }
        else if(cgpa >=3.50 && cgpa < 3.75) {
            System.out.println("Final Grade obtained A-\n");
        }
        else if(cgpa >=3.25 && cgpa < 3.50) {
            System.out.println("Final Grade obtained B+\n");
        }
        else if(cgpa >=3.00 && cgpa < 3.25) {
            System.out.println("Final Grade obtained B\n");
        }
        else if(cgpa >=2.75 && cgpa < 3.00) {
            System.out.println("Final Grade obtained B-\n");
        }
        else if(cgpa >=2.50 && cgpa < 2.75) {
            System.out.println("Final Grade obtained C+\n");
        }
        else if(cgpa >=2.25 && cgpa < 2.50) {
            System.out.println("Final Grade obtained C\n");
        }
        else if(cgpa >=2.00 && cgpa < 2.25) {
            System.out.println("Final Grade obtained D\n");
        }
        else if(cgpa >=0.00 && cgpa < 2.00) {
            System.out.println("Final Grade obtained F\n");
        }
        else {
            System.out.println("Error obtaining Final Grade.\n");
        }
    }
}
