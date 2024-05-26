
interface Anonymous {
    // declaration of a function....................
    void displayAnonymous(int num);
    void disk();
}

public class COLLEDGE_AnonymousClasses {
    // defining an object.....
    public static void main(String[] args) {
        Anonymous obj1 = new Anonymous() {
            @Override
            public void displayAnonymous(int num) {
                System.out.println("The number is: " + num);
            }
            // Another Function......
            public void disk() {
                System.out.println("Another function can be created in Anonymous classes....");
            }
        };
        obj1.displayAnonymous(23);
        obj1.disk();
    }
}
