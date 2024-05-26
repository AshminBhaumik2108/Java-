class GenericClassesPart2< DataType1 , DataType2 > {
    // Constructor Declaration................
    public DataType1 obj1; public DataType2 obj2;
    public GenericClassesPart2(DataType1 obj1, DataType2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // Declaring methods to return.....
    public GenericClassesPart2<DataType1, DataType2>  getData1() {
        GenericClassesPart2<DataType1, DataType2> object = new GenericClassesPart2<>(this.obj1, this.obj2);
        return object;
    }
}
// Declaring the main Methode......
public class COLLEDGE_GenericClasses2nd {
    public static void main(String[] args) {
        GenericClassesPart2<String, Integer> obj = new GenericClassesPart2<>("Ashmin", 21);
        GenericClassesPart2 returnValue = obj.getData1();
        System.out.println("Obj1: "+returnValue.obj1+" & obj2: "+returnValue.obj2);
    }
}
