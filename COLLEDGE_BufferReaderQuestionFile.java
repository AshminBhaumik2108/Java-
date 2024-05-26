import java.io.*;

public class COLLEDGE_BufferReaderQuestionFile {
    static void BufferFile1() throws IOException {
        String str1 = "ABC", str2 = "GHI";
        try (BufferedWriter file = new BufferedWriter(new FileWriter("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\BufferWriterFile1.txt")))
        {
            file.write(str1);
            file.write(str2);
        }
    }
    static void BufferFile2() throws IOException {
        String str1 = "DEF", str2 = "JKL";
        try (BufferedWriter file = new BufferedWriter(new FileWriter("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\BufferWriterFile2.txt")))
        {
            file.write(str1);
            file.write(str2);
        }
    }
    static void BufferFileAppend() throws IOException {
        BufferedReader file1 = new BufferedReader(new FileReader("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\BufferWriterFile1.txt"));
        BufferedReader file2 = new BufferedReader(new FileReader("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\BufferWriterFile2.txt"));
        try (BufferedWriter Outappendfile =
                     new BufferedWriter(new FileWriter("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\AppendBufferWriterFile.txt"))) {
            // Logic for reading the file......
            String line1, line2;
            while ((line1 = file1.readLine()) != null && (line2 = file2.readLine()) != null) {
                Outappendfile.write(line1);
                Outappendfile.newLine();
                Outappendfile.write(line2);
                Outappendfile.newLine();
            }
        }
    }
    // Main function.........
    public static void main(String[] args) throws IOException{
        BufferFile1();
        BufferFile2();
        BufferFileAppend();
    }
}
