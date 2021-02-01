package com.company;

import java.util.Scanner;

 public class Switches {
     public static void myMethod(){
         Scanner input = new Scanner(System.in);
         System.out.println("Please write the day number");
         int dayNumb = input.nextInt();
         switch(dayNumb) {
             case 1:
             case 2:
             case 3:
             case 4:
             case 5:
                 System.out.println("It is a working day");
                 break;
             case 6:
             case 7:
                 System.out.println("It is holiday");
                 break;
             default:
                 System.out.println("Please choose a day number from 1 to 7!");
         }}

       //Task number2
       public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please write the grade level from A to F");
char gradeLevel = (char) input.nextShort();
        switch(gradeLevel) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println("Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println("Error! Please choose grade level from A to F!");
        }
            }

}