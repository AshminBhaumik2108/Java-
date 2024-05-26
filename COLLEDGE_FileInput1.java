import java.io.*;
public class COLLEDGE_FileInput1 {
    // To take an input from a file through FileInputStream.....
    public static void main(String[] args) {
//        FileInputStream file = null;
        try {
            FileInputStream file = new FileInputStream("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\AshminJavaInputFile1.txt");
            int ascaiiValueStorage;
            while((ascaiiValueStorage = file.read()) != -1) {
                System.out.print((char)ascaiiValueStorage);
            }
            file.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
