import java.util.*;
import java.io.*;

public class FileHandelingPractice2 {
    // InputStream and outputStream....
    public static void main(String[] args) throws Exception {
        // Defining an Input stream....
        FileInputStream fileReader = new FileInputStream("D:\\FILES\\file1.txt");
        int value;
        while((value = fileReader.read()) != -1) {
            if(value >= 90 && value <= 122) {
                System.out.print(" ");
            }
            else if(value >=65 && value <=90) {
                System.out.print((char)value);
            }
        }
//        Scanner sc = new Scanner(System.in);
//        FileOutputStream fileWriter = new FileOutputStream("D:\\FILES\\file1.txt");
//        System.out.print("Enter String: "); String str = sc.nextLine();
//        // we have to write '.getBytes()' to change the string into bytes for the input....
//        fileWriter.write(str.getBytes());
//        // Output...
//        while((value = fileReader.read()) != -1) {
//            System.out.print((char)value);
//        }
    }
}
