public class COLLEDGE_MultipleTryCatch1 {
    public static void main(String[] args) {
        // Multiple Catch with one Try block....
        // Writing the try block....
        try {
            int num1 = 20, num2 = 0;  // to see the change we have to write 'num2 = 5'.
            int sumOfNumbers = num1/num2;
            System.out.println("The sum of numbers are: "+sumOfNumbers); // In a case only one catch block will work

            // 2nd case....
            int[] arr = {1, 2, 3};
            System.out.println(arr[6]);
            // The Second case will only work when the first exception is solved....
        }
        // First catch block......
        catch(ArithmeticException obj) {
            System.out.println("Sum cannot be divided by zero...");
        }
        // Second catch Block......
        catch(ArrayIndexOutOfBoundsException obj) {
            System.out.println("Array Index out of Bound Exception.................");
        }
    }
}
