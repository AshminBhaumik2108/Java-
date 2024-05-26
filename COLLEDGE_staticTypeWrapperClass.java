public class COLLEDGE_staticTypeWrapperClass {
    // Static for Defination....
    static {
        System.out.println("Hello, My name is ASHMIN");
    }
    // Static variable names declarations.....
    String name = null;
    int Roll = 0;
    static String colledge = "LPU";
    //Static Function.....
    public static void show(String name1, int roll1){

        System.out.println("My name is: " + name1 + " & my Roll Number is: " + roll1);
    }
    // main function.....
    public static void main(String[] args) {

        // Declaring
        COLLEDGE_staticTypeWrapperClass.show("Ashmin", 21);
        System.out.println("My COLLEDGE is: "+COLLEDGE_staticTypeWrapperClass.colledge);
    }
}
