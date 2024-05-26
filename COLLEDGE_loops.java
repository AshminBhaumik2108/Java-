import java.util.*;
public class COLLEDGE_loops {
    // Scanner scan = new Scanner(System.in); // It can't be declared outside.....
    static void arrayInput(int range) {
        Scanner scan = new Scanner(System.in);
        // making the address for the array.....
        int array[] = new int[range];
        System.out.println("Enter the elements: ");
        int i = 0;
        for(int iterator : array) { // iterator - can only be used for output otherwise it makes elements private..
            System.out.print("-> ");
            array[i] = scan.nextInt();
            i++;
        }
        // Enter the element to search....
        System.out.print("Enter the element to Search: ");
        int searchingElement = scan.nextInt();
        // Start Searching......
        boolean flag = false;
        for(int iterator : array) {
            if(iterator == searchingElement) {
                flag = true;
            }
        }

        // element found ?
        //System.out.println(flag);
        if(flag) {
            System.out.println("Searching Successfull");
            System.exit(0);
        }
        System.out.println("Searching Unsuccessful");
    }

    // main methode....
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Range: "); int range = scan.nextInt();
        COLLEDGE_loops.arrayInput(range);
    }
}
