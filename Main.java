// first print statement and Basics of JAVA
// import statements......

package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        // Write a code Here.....
        // PRACTICE 1.......
        double sum = 34.98998;
//        System.out.printf("Hello and welcome!\n");
//        System.out.printf("%.2f", sum);//Just helps in writing as a decimal, float..
        System.out.printf("\n");
//        System.out.println(sum); // It adds a new line automatically at the last
//        System.out.print(sum); System.out.printf("\n");
//        System.out.printf("%s is %s.\n","Ashmin Bhaumik", "Good");

        // Types of Convention Writing for Classes and Functions respectively.....
//        AddTwoNumbers --> Pascal Naming Convension
//        addTwoNumbers --> Camel Nameing Convension





        // PRACTICE 2.........
        // LITERIALS IN JAVA.......

        //INTEGER, FLOAT, DOUBLE, STRING LITERALS IN JAVA.....
        char alpha = 'A';
        byte str = 12; // range -127 to 127; 1 byte.
        short str2 = 234; // 2 byte
        int str1 = 13; // integer; 4 byte
        long str3 = 1233345666677777L; // Long should be written with 'L' or 'l'; auto it will take as integer...
        float num = 1.23f; // If 'f' is not written than by default it is a double literal.
        double num1 = 1.45d; // OR we can write only 1.45 or 1.45D.
             // NOTE: 'f' is needed to name the term as float literal...
        boolean value = true;
//        System.out.printf("The value is %b\n",value);
        String str10 = "Ashmin Bhaumik";
//        System.out.printf("My name is: %s\n", str10);





        // PRACTICE 3...
        // Take input from USER in JAVA during the Run/Compile time.......

        // NOTE: "import java.util.Scanner" --> we have to declare it at the top to take user input...
        Scanner sc = new Scanner(System.in); // This line should be declared for taking input from the user.....
//        System.out.print("Enter the First number: ");
        //int a = sc.nextInt(); // user input methode.
//        float a = sc.nextFloat();
//        System.out.print("Enter the 2nd number: ");
        //int b = sc.nextInt(); // user input methode.
//        float b = sc.nextFloat();
        //float sum2 = a + b; // sum of two numbers..
//        System.out.print("The sum of two numbers is: " + sum2 + "\n");
//        System.out.printf("The sum of two numbers is: %.3f" , sum2); // To print in numbers of decimals..


        // TO CHECK WHETHER THE NUMBER IS HAVING THE INT OR FLOAT OR CHAR OR STRING.....
//        System.out.print("Enter the number to check: ");
//        Boolean bool = sc.hasNextInt();
//        System.out.println("User input is: " + bool);
//        System.out.print("Enter the String to check: ");
         // TO CHECK FOR STRINGS................................................................
//        Boolean bool1 = sc.hasNext();
//        System.out.println("User input is: " + bool1);


        // TO TAKE STRING INPUTS FROM USER....
//        System.out.print("Enter the word to check1: ");
//        String ash = sc.next(); //It will take the input for one word...
//        System.out.print("The word is: " + ash + "\n");
//        System.out.print("Enter the sentence to check2: ");
//        String bhau = sc.nextLine();
//        System.out.print("The word is: " + bhau);




        // PRACTICE 4..................................................................................................
        // TO TAKE INPUT FOR CHARACTER.....................................
//          Scanner character_reader = new Scanner(System.in);
//          System.out.print("Enter new Character: ");
//          char numeric = character_reader.next().charAt(1); // Taking the Character from the index...
//          System.out.println("The Character is: " + numeric);



        // PRACTICE 5..................................................
        // BITWISE AND &&, ||, etc.. OPERATORS.............
//        System.out.println(2&3); // 2 i.e. 10 & 11 == 10 i.e. 3.............
//        System.out.println(64 > 9 && 54 > 8);

        // ** NOTE: Remainders work on 4.8 & 1.1 i.e. It works on float and double..

        // TYPECASTING IN JAVA......
        // INCREMENT AND DECREMENT OPERATORS WORKS SAME AS C++ in JAVA

        int i = 34;
//        System.out.println(i);
//        System.out.println(i++);
//        System.out.println(i);
//        System.out.println(++i);
//        System.out.println(i);

        String asd = "Ashmin";
//        System.out.println(asd);

    }
}




















