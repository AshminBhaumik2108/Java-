import java.io.*;
import java.util.*;

public class COLLEDGE_ArrayList_1st {
    public static void main(String[] args) {
        // Introducing the template arraylist......
        ArrayList<Object> arrayOfObjects= new ArrayList<Object>();
        arrayOfObjects.add(10);
        arrayOfObjects.add(1, 20);
        arrayOfObjects.add(0,30);
        arrayOfObjects.add(40);
        arrayOfObjects.add(50);
        arrayOfObjects.add("Hello");
        System.out.println("Array Objects: " + arrayOfObjects);

    }
}
