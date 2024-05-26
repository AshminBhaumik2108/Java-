public class COLLEDGE_WrapperClasses {

    static {
        System.out.println("Welcome to Wrapper Classes...");
    }

    public static void main(String[] args){

        // Primitive to Object Classes....
        int primitiveToObject = 32;
        Integer changedPrimitive = Integer.valueOf(primitiveToObject);
        System.out.println("Object Class: " + changedPrimitive);

        // Object to Primitive.....
        Integer objectToPrimitive = Integer.valueOf(53);
        int changeObject = objectToPrimitive.intValue();
        System.out.println("Primitive Class: "+changeObject);

        // Another Methode......
//        Integer d = new Integer(10);
//        int i = Integer.valueOf(d);
//        System.out.println(i);
    }
}
