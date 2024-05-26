import java.util.Scanner;
public class CA_PracticeUNIT3and4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, SpecialFactor;
        System.out.print("Enter Length: "); length = sc.nextInt();
        System.out.print("Enter Special Factor: "); SpecialFactor = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0; i<length; i++) {
            System.out.print("*: "); arr[i] = sc.nextInt();
        }
        for(int i : arr) {
            System.out.print((i*SpecialFactor)+" ");
        }
    }
}
