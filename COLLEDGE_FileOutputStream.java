import java.io.*;
public class COLLEDGE_FileOutputStream {
    // Write a stream of Inputs in a file without appending.......
    // The Input portion of the file in the program.........
    public static void main(String[] args) {
        String str = "There is an Input by Ashmin Bhaumik";
        try {
            // NOTE: The streams of data are send in Bytes. So, we need to send the data in Bytes.....
            FileOutputStream Inputfile = new FileOutputStream("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\OutputStream.txt");
            Inputfile.write(str.getBytes()); // Important to write '.getBytes()'.....
            // Closing the file...........
            Inputfile.close();
        } catch(IOException e) {
            System.out.println("There is an Error in File....");
        }
        // Giving the output from the file of the given above.........
        try {
            FileInputStream Outputfile = new FileInputStream("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\OutputStream.txt");
            int IntTOChar;
            while((IntTOChar = Outputfile.read()) != -1) {
                System.out.print((char)IntTOChar);
            }
            // Closing the file.............
            Outputfile.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println("There is an error in File......");
        }
    }
}
