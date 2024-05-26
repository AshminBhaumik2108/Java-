import java.io.FileReader;//import java.io.BufferedReader;
import java.io.*;
//
public class COLLEDGE_BufferReaderClass {
    static void BufferFile1() throws IOException {
        String str1 = "ABC", str2 = "GHI";
        BufferedWriter file = new BufferedWriter(new FileWriter("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\BufferWriterFile1.txt"));
        file.write(str1);
        file.write(str2);
    }
    public static void main(String[] args) throws Exception {
////        // File Doesn't work since it is a bufferReader............................
////        File file =new File("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\OutputStream.txt");
////        // We have to take FileReader to work on it.........................
//        FileReader file = new FileReader("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\OutputStream.txt");
//        BufferedReader bufferedReader = new BufferedReader(file);
////        InputStreamReader file = new InputStreamReader(System.in);
////        BufferedReader bufferedReader = new BufferedReader("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\OutputStream.txt");
//        String str = "";
//        while((str = bufferedReader.readLine()) !=  null) {
//            System.out.println(str);
//        }
////        int str;
////        while((str = bufferedReader.read()) !=  -1) {
////            System.out.println((char)str);
////        }
////        // Closing file.....
////
////
        BufferFile1();

    }
}
