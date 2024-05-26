import java.util.Scanner;

public class MATHEMATICAL_EXP {
    public static void main(String args[])
    {
//        System.out.println("It's ASHMIN from Mathematics..");

        // How does the Mathematical Expressions works on JAVA with float, Double, Int and beta..
        float numberToCount = 7/5.0f * 6/2.0f;
//        System.out.printf("The Number is: %.2f\n", numberToCount);

        // Character can be used with integer because it changes the character to ASCAII values and then add the int..
        // Type Casting in JAVA.........
        char charLetter = 'B';
        // Before Decode ..
        charLetter = (char)(charLetter + 8);
//        System.out.printf("The new letter is before: %c\n", charLetter);
        charLetter = (char)(charLetter - 8);
//        System.out.printf("The new letter is after: %c\n", charLetter);

        // Boolean values in JAVA...

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter any Number to Compare: ");
//        int num1 = sc.nextInt(); // Taking input from user...
//        // This will print out True or False...
//        System.out.println( num1 > 24 );

        // Mathematical Operation: (v*v - u*u)/(2*a*s).......

        System.out.print("Enter v: ");
        float v = sc.nextFloat();
        System.out.print("Enter v: ");
        float u = sc.nextFloat();
        float sum = ((v*v - u*u)/(2*u*v));
        System.out.printf("The total sum is: %.2f", sum);











    }
}
