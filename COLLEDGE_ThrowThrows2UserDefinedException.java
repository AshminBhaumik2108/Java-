// Note that the Exception class is declared from the first in java.......
// 1st Class.........
class AshminException extends Exception {
    // constructor
    public AshminException() {
        System.out.println("My name is Ashmin");
    }
}
// 2nd Class.............
class BhaumikException extends Exception {
    public BhaumikException() {
        System.out.println("My title is Bhaumik");
    }
}
public class COLLEDGE_ThrowThrows2UserDefinedException {
    void userDefinedException(String name1, String name2) throws AshminException, BhaumikException {
        if(!name1.equals("Ashmin")) {
            throw new AshminException();
        }
        else if(!name2.equals("Bhaumik")) {
            throw new BhaumikException();
        }
        else {
            System.out.println("Correct name......");
        }
    }

    public static void main(String[] args) {
        String name1 = "Ashmin", name2 = "Bhamik";
        COLLEDGE_ThrowThrows2UserDefinedException obj = new COLLEDGE_ThrowThrows2UserDefinedException();
        // Writing try block....
        try {
            obj.userDefinedException(name1, name2);
        }
        catch(AshminException a) {
            System.out.println("The name is Corrected......");
        }
        catch(BhaumikException b) {
            System.out.println("The title is Corrected....");
        }
    }
}
