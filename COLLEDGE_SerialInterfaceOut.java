import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class COLLEDGE_SerialInterfaceOut {
    public static void main(String[] args) throws Exception {
        // It calls all the file string together and print it.....
        // Reading the file....
        FileInputStream file1 = new FileInputStream("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\ObjOutputStream.txt");
        ObjectInputStream os1 = new ObjectInputStream(file1);
        // Making an object / TypeCasting into object....
        SerialObjectClass soc = (SerialObjectClass) os1.readObject();
        System.out.println(soc);
    }
}
