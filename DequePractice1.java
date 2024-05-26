import java.util.*;

public class DequePractice1 {
    public static void main(String[]  args) {
        Deque<String> rivers = new ArrayDeque<>();
        rivers.offer("Ganga");
        rivers.offer("Yamuna");
        rivers.offer("Sutlej");
        System.out.println(rivers);
        while(!rivers.isEmpty()) {
            System.out.print(rivers.pollLast()+" ");
        }
    }
}
