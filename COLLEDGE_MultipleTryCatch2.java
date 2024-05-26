public class COLLEDGE_MultipleTryCatch2 {
    public static void main(String[] args) {
        // One after another all the try-catch block will work.....
        // Multiple Catch with Multiple Try block....
        // Writing the try block....
        try {
            int num1 = 20, num2 = 0;
            int sumOfNumbers = num1/num2;
            System.out.println("The sum of numbers are: "+sumOfNumbers);
        }
        // First catch block......
        catch(ArithmeticException obj) {
            System.out.println("Sum cannot be divided by zero...");
        }
        // Writing another try block....
        try {
            // 2nd case....
            int[] arr = {1, 2, 3};
            System.out.println(arr[6]);
        }
        // Second catch Block......
        catch(ArrayIndexOutOfBoundsException obj) {
            System.out.println("Array Index out of Bound Exception.................");
        }
    }
}
