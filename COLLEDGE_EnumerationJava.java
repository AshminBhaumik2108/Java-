import java.util.*;

public class COLLEDGE_EnumerationJava {
    enum weekDays {
        MON, TUES, WEDS, THURS, FRI, SAT, SUN;
    }
    // Main function.....
    public static void main(String[] args) {
        for(weekDays iterator : weekDays.values()) {
            System.out.print(iterator + " ");
        }
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        weekDays name = weekDays.valueOf(str);
        switch(name) {
            case MON:
                System.out.println("Monday..");
                break;
            case TUES:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid");
        }
    }


}
