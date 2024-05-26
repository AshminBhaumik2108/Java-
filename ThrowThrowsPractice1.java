import java.io.*;

class AshminBhaumikException extends Exception {
    public AshminBhaumikException(String message) {
        super(message);
    }
}

public class ThrowThrowsPractice1 {
    void additionMessage(String num) throws AshminBhaumikException {
        if(num == "Ashmin") {
            throw new AshminBhaumikException("I am feeling sleepy...");
        }
    }
    public static void main(String[] args) throws AshminBhaumikException {
        ThrowThrowsPractice1 object = new ThrowThrowsPractice1();
        object.additionMessage("Ashmin");

    }
}
