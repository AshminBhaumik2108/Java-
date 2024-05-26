public class COLLEDGE_NestedClass {
    int variable1 = 10;
    static int variable2 = 20;
    private int variable3 = 30;
    //Nested class methode........
    static class InnerClass {
        // Since variables are non-static.....
        COLLEDGE_NestedClass obj = new COLLEDGE_NestedClass();
        void sumOfNumbers() {
            int variable4 = obj.variable1 + variable2 + obj.variable3;
            System.out.println("The Sum is: "+variable4);
        }
    }
    // Main function......
    public static void main(String[] args){
        InnerClass obj = new COLLEDGE_NestedClass.InnerClass();
        obj.sumOfNumbers();
    }
}
