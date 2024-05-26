import java.util.*;

public class COLLEDGE_ArrayList_2st {
    public static void main(String[] args) {
        // Introducing the template arraylist......
        ArrayList<Object> arrayOfObjects = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values: ");
        int Range = sc.nextInt();
        // Entering the loop......
        for(int i=0; i<Range; i++) {
            System.out.print("*: ");
            arrayOfObjects.add(sc.next());
        }
        System.out.println("Array: "+arrayOfObjects);
    }
}
