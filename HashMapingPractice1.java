import java.util.*;

public class HashMapingPractice1 {
    public static void main(String[] args) {
        // Introducing Hashmap...
        Scanner sc = new Scanner(System.in);
        // Entering the size of the data....
        System.out.print("Enter Size: "); int Range = sc.nextInt();
        // Declaring HashMap...
        HashMap<Integer, String> hashMap_Object1 = new HashMap<>();
        // Entering the loop for taking keys and Values....
        for(int i=0; i<Range; i++) {
            System.out.print("Key: ");int key = sc.nextInt();
            sc.nextLine();
            System.out.print("Value: ");String Value = sc.nextLine();
            hashMap_Object1.put(key, Value);
        }
        System.out.println(hashMap_Object1.keySet());
        System.out.println(hashMap_Object1.values());
        System.out.println(hashMap_Object1.containsValue("Ashmin")); // returns boolean values....
    }
}
