public class COLLEDGE_InilizationBlock {
    static int data; // Static data can be called in static Block, Constructor & Initilization Block...
    {
        System.out.println("Hello.......................");
    }
    static {
        System.out.println("Its a STATIC Block...");
        System.out.println("Data Value: "+data);
    }
    COLLEDGE_InilizationBlock(){
        System.out.println("Data Value is: "+data);
        System.out.println("Default Constructor Called..");
    }
    // Initilazion Block... // It will be called always first...
    {
        System.out.println("Before Initilization Block called First..."+data);
        data = 54;
        System.out.println("After Initilization Block called First..."+data);
    }

    // main function...
    public static void main(String[] args){
        COLLEDGE_InilizationBlock obj1 = new COLLEDGE_InilizationBlock();
        System.out.println("End of Program...");
    }


}
