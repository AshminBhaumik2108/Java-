public class COLLEDGE_VariableArguments {
    void multipleParameters(String name, int... num) {
        System.out.println("Name: "+name);
        for(int iterator : num) {
            System.out.println(iterator);
        }
    }
    public static void main(String[] args) {
        COLLEDGE_VariableArguments obj = new COLLEDGE_VariableArguments();
        obj.multipleParameters("Ashmin",2);
        obj.multipleParameters("Bhaumik",2, 3, 4);
    }
}


