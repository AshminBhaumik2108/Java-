import java.io.*;
public class COLLEDGE_ByteArrayInputStream {
    public static void main(String[] args) {
        // Giving an input byte of array.....
        byte[] ascaiiValue = {71, 69, 69, 75, 83};
        //Declaring a ByteArrayInputStream......
        ByteArrayInputStream barry = new ByteArrayInputStream(ascaiiValue);
        int b = 0;
        while((b = barry.read()) != -1) {
            char ch = (char)b;
            System.out.println("Char: "+ch);
        }
    }

}
