public class COLLEDGE_GenericMethode3rd {
    public static <DataType> void OverLoad(DataType a, DataType b) {
        System.out.println(a+" "+b);
    }
    // main methode.........
    public static void main(String[] args) {
        Integer num1 = 21, num2 = 34;
        OverLoad(num1, num2);
    }
}
