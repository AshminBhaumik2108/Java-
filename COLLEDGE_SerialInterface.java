import java.io.*;

class SerialObjectClass implements Serializable {
    String name; int RollNo, marks;
    // Constructor....
    SerialObjectClass(String name, int RollNo, int marks) {
        this.name = name;
        this.RollNo = RollNo;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Name: "+name+" Roll No: "+RollNo+" Marks: "+marks;
    }
}

public class COLLEDGE_SerialInterface {
    public static void main(String[] args) throws Exception {
        SerialObjectClass obj = new SerialObjectClass("Ashmin", 35, 97);
//        System.out.println(obj);

        // Writing the file block......
        FileOutputStream file = new FileOutputStream("D:\\SEMISTER 4\\CSE310 PROGRAMMING IN JAVA\\ObjOutputStream.txt");
        ObjectOutputStream os = new ObjectOutputStream(file);
        // In build Keyword....
        os.writeObject(obj);
        os.close();
    }
}
