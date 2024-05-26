class CLASSES_Inharitance {
    CLASSES_Inharitance() {
        System.out.println("Welcome to the CLASSES_Inharitance World...");
    }
static class InnerClass {
    InnerClass(){
        System.out.println("Welcome to InnerClass World..."); // Const. will not be called until we make an object.
    }
    static void display() {
        System.out.println("outer_x = " + 21);
        System.out.println("outer_y = " + 30);
        System.out.println("outer_private = " + 43);
    }
  }
    public static void main(String[] args)
    {
        // accessing an inner class
        //CLASSES_Inharitance outerObject = new CLASSES_Inharitance(); // if we do not declare class as static....
        //CLASSES_Inharitance.InnerClass innerObject = outerObject.new InnerClass(); // if we do not declare function as static....
        InnerClass.display();
    }
}



