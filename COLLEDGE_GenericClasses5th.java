public class COLLEDGE_GenericClasses5th {
    // declaring methods
    public static <DataType extends Number> Number sumOfNumbers(DataType x, DataType y) {
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        // using the instance of variable.........
        if(x instanceof Double) {return x.doubleValue() + y.doubleValue();}
        else if(x instanceof Integer) {return x.intValue() + y.intValue();}
        return x.shortValue()+y.shortValue();
    }
    public static void main(String[] args) {
        COLLEDGE_GenericClasses5th obj = new COLLEDGE_GenericClasses5th();
        System.out.println(obj.<Integer>sumOfNumbers(100, 200));
        System.out.println(obj.<Double>sumOfNumbers(100.80, 200.20));
        System.out.println(obj.<Short>sumOfNumbers((short)10, (short)20));
    }
}
