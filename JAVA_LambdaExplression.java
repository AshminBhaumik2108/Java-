// Just for only one methods Present....
// The lambda Methode doesn't work with two functions in the interface....
// We need only one method in the Interface to work with Lambda Expressions....
@FunctionalInterface
interface Dracula {
    void DraculaMethod(int x);
    default void Money() {
        System.out.println("We don't have Money");
    }
}
public class JAVA_LambdaExplression {

    public static void main(String[] args) {
        // Making a Lambda Methods in the function.......
//        int x;
        Dracula obj1 = (x) -> {
            System.out.println("Print the Dracula Name: "+(x*x));
        };
        obj1.DraculaMethod(3);
//        obj1.Money(); // If the function is declared with default than we can use it/ implement........
    }

}


