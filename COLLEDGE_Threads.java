// introducing threading.................
class ThreadImplement extends Thread {
    ThreadImplement() {
        super("Ashmin");
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println((Thread.currentThread()).getName() + " thread here....");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {}
    }
}
// Main Thread....
public class COLLEDGE_Threads {
    public static void main(String[] args) {
        ThreadImplement obj1 = new ThreadImplement();
        obj1.start();
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println((Thread.currentThread()).getName() + " thread here....");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {}
    }
}
