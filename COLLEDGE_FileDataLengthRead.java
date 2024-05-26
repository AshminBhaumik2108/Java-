import java.io.*;
public class COLLEDGE_FileDataLengthRead {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\OutputStream.txt");
            // Returns the total number of characters.....
            int fileDataSize = inputStream.available();
            byte[] byteArray = new byte[fileDataSize];
            // It will read the length of the data present in the file and String it.....
            inputStream.read(byteArray);
            // Prints the length of the
            System.out.println("Length is: "+byteArray.length);
        }catch(Exception e) {
            System.out.println("Error in file....");
        }
    }
}
