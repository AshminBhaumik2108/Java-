import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class COLLEDGE_SerialInputOutput {
    public static void main(String[] args) throws Exception {
        // Importing scanner.....
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String data = sc.nextLine();
        // File Handeling....
        // Without object Stream class......
        FileOutputStream obj = new FileOutputStream("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\StreamInpOut.txt");
        obj.write(data.getBytes());

        // File Reading....
        FileInputStream obj1 = new FileInputStream("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\StreamInpOut.txt");
        int inp;
        while((inp = obj1.read()) != -1) {
            System.out.print((char)inp);
        }
    }
}
