import java.io.*;
public class COLLEDGE_FileAppend {
    public static void main(String[] args) {
        // Trying to append a streams of data to a file....
        // declaring the file address. If not present than it mill make it automatically......
        String data = ". Appending a new data";
        File fileName = new File("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\AppendFileStream.txt");
        try {
            // FileWriter is a character Stream.....
            FileWriter fileAppend = new FileWriter(fileName, true);
            fileAppend.write(data);
            fileAppend.close();
        } catch(IOException e) {
            System.out.println("Error in file");
        }
    }

}
