// declaration of the Grand Parent class.......
abstract class Parent1 {
   int sumOfNumbers = 10;
   public void display() {
       System.out.println("The sum of two numbers is :"+sumOfNumbers);
   }
   abstract void addition(int num);
   abstract void subtraction(int num);
}

class child1 extends Parent1 {
    void addition(int num) {
        System.out.println("Addition num is: "+num);
    }
    void subtraction(int num) {
        System.out.println("Addition num is: "+num);
    }
}

class child2 extends Parent1 {
    void addition(int num){
        System.out.println("Addition num is: "+num);
    }
    void subtraction(int num) {
        System.out.println("Addition num is: "+num);
    }
}
public class COLLEDGE_AbstructionKeyWord {
    public static void main(String[] args){
        child1 obj1 = new child1();
        child2 obj2 = new child2();
        obj1.addition(3);
        obj1.subtraction(4);
        obj2.addition(5);
        obj2.subtraction(6);
    }
}
