class Parent {
    // creating Instance Variables...
    int A, B;
    int C = 6;
    // Creating a Constructor of Parent class...
    Parent(int num1, int num2) {
        A = num1;
        B = num2;
        System.out.println("The base class constructor: "+this.A+" "+this.B);
    }

    public void display(){
        System.out.println("I am Parent");
    }
}
public class COLLEDGE_SuperKeyword extends Parent {
    // Creating constructor of Derived class and using super for calling the parent class constructor...
    int C;
    int A = 45; int B = 55;
    COLLEDGE_SuperKeyword(int num1, int num2, int num3) {
        super(num1, num2);
        // naming for variable num3...
        C = num3;
        // Using super for taking the values from the Parent class objects...
        System.out.println("The constructor of Base class super: "+super.A+" "+super.B+" "+super.C);
        System.out.println("The constructor of Base class this: "+this.A+" "+this.B+" "+this.C);

    }
    public void display() {
        super.display();
        System.out.println("I am Child");
    }
    public static void main(String[] args){
        System.out.println("Welcome to JAVA....");
        COLLEDGE_SuperKeyword obj1 = new COLLEDGE_SuperKeyword(10, 20, 30);
        obj1.display();

    }
}
