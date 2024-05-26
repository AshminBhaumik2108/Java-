
@FunctionalInterface
interface CollegeLamdaExpression {
    // declaring an interface............
    void displayName(String name);
    // declaring and defining an default body.............
    default void workingStatus() {
        System.out.println("Default will work on interface with Body..............");
    }
}
@FunctionalInterface // with Return Type................
interface ReturnTypeInterface {
    // declaring an interface............
    String displayName(String name);
    // declaring and defining an default body.............
    default void workingStatus() {
        System.out.println("Default will work on interface with Body..............");
    }
}
public class COLLEDGE_LamdaExpression {
    public static void main(String[] args) {
        // Making a reference of the interface.............
        CollegeLamdaExpression obj1 = (name) -> {
            System.out.println("Hello my name is "+name);
        };
        // calling the functions in interface.................
        obj1.displayName("Ashmin");
        obj1.workingStatus();

        // Now with Return Type Interface............
        ReturnTypeInterface obj2 = (name) -> (name);
        // It will return my name with Return Type...........
        System.out.println(obj2.displayName("Ashmin"));
        obj2.workingStatus();
        String g = new String("2");
        String str = g.toString();
        System.out.println(str);

    }
}
