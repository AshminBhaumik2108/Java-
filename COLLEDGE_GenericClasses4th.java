// Generic Methods/Functions for Array Elements.....
import java.util.Scanner;
class ArrayGenericClass {
    // Declaring Generic array methode....
    public <DataType> void arrayMethode(DataType[] arrayElements) {
        // for-each loop....
        for(DataType element : arrayElements) {
            System.out.print(element + " ");
        }
    }
}
public class COLLEDGE_GenericClasses4th {
    // declaring a comment..........
    static {
        System.out.println("Generating the Array Generic methods......");
    }
    // Main Methode.....
    public static void main(String[] args) {
        // Declaring an Integer DataType......
        // declaring Scanner....
        Scanner sc = new Scanner(System.in);
        // ArrayGenericClass Object declaration.....
        ArrayGenericClass obj = new ArrayGenericClass();
//        System.out.print("Enter the range for Inputs for integers: ");
//        int range = sc.nextInt();
//        Integer[] array1 = new Integer[range];
//        // Array input....
//        for(int i=0; i<range; i++) {System.out.print("*: "); array1[i] = sc.nextInt();}
//        // Passing to object....
//        obj.arrayMethode(array1);

        // for String types......
        System.out.print("Enter the range for Inputs for Strings: ");
        int rangeStr = sc.nextInt();
        String[] array2 = new String[rangeStr];
        sc.nextLine();
        for(int i=0; i<rangeStr; i++) {System.out.print("*: "); array2[i] = sc.nextLine();}
        obj.arrayMethode(array2);
    }
}
