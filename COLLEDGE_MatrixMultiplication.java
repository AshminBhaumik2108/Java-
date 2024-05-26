import java.util.*; // OR java.util.Scanner...
public class COLLEDGE_MatrixMultiplication {
    public static void main(String[] args) {
        // importing scanner class in java...
        Scanner scan = new Scanner(System.in);
        // taking inputs of rows and columns...
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();
        // making the matrix by dynamic allocation...
        int[][] array = new int[rows][columns];
        // Entering the elements of the matrix...
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("Entered Array");
        // output of the matrix...
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // building new array for storage...
        int[][] array1 = new int[rows][columns];

        // Now for matrix multiplication...
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                for(int k=0; k<rows; k++) {
                    array1[i][j] += array[i][k] * array[k][j];
                }
            }
        }
        // printing matrix 2 after multiplication...
        System.out.println();
        System.out.println("After Multiplication ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
