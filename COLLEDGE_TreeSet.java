import java.util.*;

public class COLLEDGE_TreeSet {
    public static void main(String[] args) {
        Set<String> setObject = new TreeSet<>();
        // Scanner class...
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First name: ");
        setObject.add(sc.nextLine());
        System.out.print("Enter Second name: ");
        setObject.add(sc.nextLine());
        System.out.println("Entering the element by itself.....");
        setObject.add("abc");
//        System.out.println("Set Object: "+setObject);
        setObject.add("xyz");
        System.out.println("Set Object: "+setObject);

//        setObject.add(14); // It will give an Error.......

    }
}
