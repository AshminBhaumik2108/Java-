package com.company;
import java.util.Scanner;

public class PROJECT_OWN
{
    public static void main(String[] args)
    {
        // Write a program to calculate the total marks of 'n' subjects given by user
        // and find the percentage...


        /*
        Scanner class_input = new Scanner(System.in);
        System.out.print("Enter the number of Subjects: ");
        int numOfSubjects = class_input.nextByte();
        System.out.println("Enter the marks of each subjects: ");
        int sum = 0;
        for (int i=0; i < numOfSubjects; i++)
        {
            System.out.print("Enter marks of Subject " + i +" out of 100: ");
            int marks = class_input.nextByte();
            sum += marks;
        }
        System.out.print("Total marks is: " + sum); System.out.println();
        System.out.print("Total Percentage is: " + (sum/numOfSubjects) + "%"); System.out.println(); */



        // WAP to find that the number is a leap year or not


        /*
        Scanner leap_year = new Scanner(System.in);
        System.out.print("Enter the year to check for LEAP YEAR: ");
        int leap = leap_year.nextInt();
        if(leap % 4 == 0 && (leap % 100 != 0 || leap % 400 == 0))
        {
            System.out.println("The Year is a LEAP YEAR.");
        }
        else
        {
            System.out.println("The Year is not a LEAP YEAR.");
        } */


        // WAP to find that the number is a PRIME NUMBER OR NOT...

        Scanner primeNumber = new Scanner(System.in);
        System.out.print("Enter the number to Check for PRIME: ");
        int data = primeNumber.nextInt();
        int total = 0;
        for(int i = 1; i <= data; i++)
        {
            if(data % i == 0)
                total += 1;
        }
        // To Check.....
        if(total <= 2)
        {
            System.out.println("It is a PRIME NUMBER");
        }
        else {
            System.out.println("It is a not PRIME NUMBER");
        }

    }
}
