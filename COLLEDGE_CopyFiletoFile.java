import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class COLLEDGE_CopyFiletoFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\OutputStream.txt");
        FileWriter fileWriter = new FileWriter("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\OutputStreamCopy.txt");
        // Now writing the conditions....
        int AscaiiValue;
        while((AscaiiValue = fileReader.read()) != -1) {
            fileWriter.write(AscaiiValue);
        }
        // Closing file.....
        fileReader.close();
        fileWriter.close();
    }
}
