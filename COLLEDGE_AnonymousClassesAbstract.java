abstract class AnonymousAbstract {
    // declaration of a function....................
    abstract void displayAnonymous();
    abstract void disk();
}

public class COLLEDGE_AnonymousClassesAbstract {
    // defining an object.....
    public static void main(String[] args) {
        AnonymousAbstract obj1 = new AnonymousAbstract() {
            @Override
            public void displayAnonymous() {
                System.out.println("The number is: ");
            }

            // Another Function......
            public void disk() {
                System.out.println("Another function can be created in Anonymous classes....");
            }
        };
        obj1.displayAnonymous();
        obj1.disk();
    }
}
