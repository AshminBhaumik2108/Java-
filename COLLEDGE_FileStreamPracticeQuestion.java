// Data of two files should be merged into other file....
import java.util.Scanner;
import java.io.*;

public class COLLEDGE_FileStreamPracticeQuestion {
    static void FirstFileInput1(String str) throws Exception {
        FileOutputStream file = new FileOutputStream("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\FileStreamFile1.txt");
        file.write(str.getBytes());
    }
    static void FirstFileInput2(String str) throws Exception {
        FileOutputStream file = new FileOutputStream("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\FileStreamFile2.txt");
        file.write(str.getBytes());
    }
    static void AppendFile() throws Exception {
        File fileName1 = new File("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\FileStreamFile1.txt");
        File fileName2 = new File("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\FileStreamFile2.txt");
        File AppendFileName = new File("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\AppendFileStreamFile.txt");
        FileWriter fileAppend = new FileWriter(AppendFileName, true);
        // Writing the data int the file.....
        // It is declared for using for both the files....
        int inp;
        // For the first File......
        FileInputStream obj1 = new FileInputStream(fileName1);
        while((inp = obj1.read()) != -1) {
            fileAppend.write((char)inp);
        }
        // For the Second File......
        FileInputStream obj2 = new FileInputStream(fileName2);
        while((inp = obj2.read()) != -1) {
            fileAppend.write((char)inp);
        }
        fileAppend.close();
    }
    public static void main(String[] args) throws Exception {
        // importing Scanner...
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: "); String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: "); String str2 = sc.nextLine();
        // Writing both the string in separate files......
        FirstFileInput1(str1); FirstFileInput2(str2);
        // Appending both the above files in other files......
        AppendFile();
    }
}
