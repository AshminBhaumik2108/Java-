import java.util.*;
import java.io.*;

public class FileHandelingPractice1 {
    // It was using BUFFERED READER AND WRITER...
    public static void main(String[] args) throws Exception {
        BufferedReader readFile = new BufferedReader(new FileReader("D:\\FILES\\file1.txt"));
        // Writing the file Contents on the same File by Append......
        // Must declare the BufferedWriter like this, otherwise it will not work.......
        try(BufferedWriter writeFile = new BufferedWriter(new FileWriter("D:\\FILES\\file1.txt", true))) {
            String str;
            while((str = readFile.readLine()) != null) {
                writeFile.write(str);
            }
            // Contents Appended in file Successfully..................
            System.out.println("Contents Appended in file Successfully......");
        }
        // Writing the under defined Contents in te file......
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in); String content = sc.nextLine();
        try(BufferedWriter writeFile = new BufferedWriter(new FileWriter("D:\\FILES\\file1.txt", true))) {
            writeFile.write("\n"+content); // Content written in the file.....
            System.out.println("Content Written Successfully......");
        }

    }
}
