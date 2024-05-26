class GenericClasses< DataType1 , DataType2 > {
    // Constructor Declaration................
    DataType1 obj1; DataType2 obj2;
    public GenericClasses(DataType1 obj1, DataType2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // Declaring methods to return.....
    public DataType1 getData1() {
        return obj1;
    }
    public DataType2 getData2() {
        return obj2;
    }
}

public class COLLEDGE_GenericClass {
    public static void main(String[] args) {
        GenericClasses<String, Integer> obj = new GenericClasses<>("Ashmin", 21);
        System.out.println(obj.getData1());
        System.out.println(obj.getData2());

    }
}
