// declaration of the Grand Parent class.......
interface GP {
    int sumOfNumbers = 10;
    public default void display() {
        System.out.println("The sum of two numbers is :"+sumOfNumbers);
    }
    int num = 2334;
    default void addition(){
        System.out.println("Addition num is: "+num);
    }
    default void subtraction(){
        System.out.println("Subtraction num is: "+num);
    }
}

class GC1 implements GP {
    public void addition() {
        System.out.println("Addition num is: "+num);
    }
    public void subtraction() {
        System.out.println("Addition num is: "+num);
    }
}

class GC2 implements GP {
    public void addition(){
        System.out.println("Addition num is: "+num);
    }
    public void subtraction() {
        System.out.println("Addition num is: "+num);
    }
}
public class COLLEDGE_InterfaceKeyword {
    public static void main(String[] args){
        GC1 obj1 = new GC1();
        GC2 obj2 = new GC2();
        obj1.addition();
        obj1.subtraction();
        obj2.addition();
        obj2.subtraction();
    }
}
