public class COLLEDGE_ThrowThrows1 {
    // Throw and Throws are been used with
    // user defined Function.......
    void zeroDivision(int num1, int num2) throws ArithmeticException, NullPointerException {
        if(num2 == 0) {
            throw new ArithmeticException();
        }
        else if(num1 == 0) {
            throw new NullPointerException();
        }
        else {
            System.out.println("I am not an Exception....");
        }
    }

    public static void main(String[] args) {
        COLLEDGE_ThrowThrows1 obj = new COLLEDGE_ThrowThrows1();
        // try block.......
        try {
            int num1 = 0, num2 = 10;
            obj.zeroDivision(num1, num2);
        }
        catch(ArithmeticException ae) {
            System.out.println("An Arithematic Exception.....");
        }
        catch(NullPointerException ne) {
            System.out.println("Null Pointer Exception....");
        }
    }
}
