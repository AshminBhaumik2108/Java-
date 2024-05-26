import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
// IT IS THE CORRECT FORMAT
public class COLLEDGE_BufferReaderWriter {
    public static void main(String[] args) throws IOException {
        String str1 = "ABC", str2 = "GHI";
//         file = null;
        try (BufferedWriter file = new BufferedWriter(new FileWriter("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\BufferWriterFile2.txt", true))) {
        file.write(str1);file.write(str2);
        System.out.println("Successfully Written in File...");}
//        catch(IOException e) {}

        // In BufferClass we need to use try-catch with the syntax.........
    }
}
