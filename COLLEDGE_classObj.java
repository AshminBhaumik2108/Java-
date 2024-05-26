public class COLLEDGE_classObj {
    int instanceVariable = 34;
    static int staticVariable = 78;
    // paramatirized Constructor....
    public COLLEDGE_classObj() {}
    public COLLEDGE_classObj(String name)
    {
        System.out.println("Hello " + name + ", lets run the Program together......");
    }
     // defining function...
    public void show()
    {
        int localVariable = 12;
        System.out.println("The local variable is: "+localVariable);
    }
    // defining the main function.....
    public static void main(String[] a)
    {
        // defining an object of class...
        COLLEDGE_classObj obj1 = new COLLEDGE_classObj();
        // Now lets print all the above...
        obj1.show();
        //printing the instance and static classs.....
        System.out.println("The instance variable is: "+obj1.instanceVariable);
        System.out.println("The static variable is: "+COLLEDGE_classObj.staticVariable);
        // Doesn't make any sense...
        System.out.println("The static variable(obj1) is: "+obj1.staticVariable);
    }
}
