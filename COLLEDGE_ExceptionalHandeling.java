public class COLLEDGE_ExceptionalHandeling {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;
        try {
            int zeroDivision = num1/num2;
            System.out.println("The value: "+zeroDivision);
        }
        catch(ArithmeticException obj1) { // NullPointerException || NumberFormatException || ArithmeticException ||
                                          // ArrayIndexOutOfBoundsException || InterruptedException || IOException
            System.out.println("Zero division Error");
        }
        // Finally will always Execute.....
        finally {
            System.out.println("'finally' will always Execute..");
        }
    }
}
