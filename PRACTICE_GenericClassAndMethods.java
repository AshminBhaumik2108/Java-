import java.util.*;
// Using all the Generic classes...................
class GenericClassAndMethods <DataType1, DataType2> {
    // Instance Variables.....
    DataType1 StudentName;
    DataType2 RegistrationNumber;
    // Constructors Importing.......
    public GenericClassAndMethods(DataType1 StudentName, DataType2 RegistrationNumber) {
        this.StudentName = StudentName;
        this.RegistrationNumber = RegistrationNumber;
    }
    // Importing Methods in Java by Generic Classes....
    public void CalculatingMarks(float Marks) {
        float TotalMarks = 100;
        // Calculating.....
        float percentage = (Marks/TotalMarks)*100;
        System.out.println("Name: "+StudentName+" & Registration Number: "+RegistrationNumber);
        System.out.printf("Percentage is: %.2f", percentage);
        System.out.println("%");
    }
}

public class PRACTICE_GenericClassAndMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: "); String Name = sc.nextLine();
        System.out.print("Enter Registration Number: "); int RegNo = sc.nextInt();
        // Calling the object.....
        GenericClassAndMethods<String, Integer> obj1 = new GenericClassAndMethods<>(Name, RegNo);
        System.out.print("Enter the Marks: "); float Marks = sc.nextFloat();
        obj1.CalculatingMarks(Marks);
    }
}
