class MyRunnable implements Runnable {
    Thread thread; // Creating an object since it is an implement method..........
    MyRunnable() {
        // Create a new thread and pass 'this' (current instance of MyRunnable) as the target
        thread = new Thread(this, "Second Thread");
        // Start the thread
        thread.start();
    }

    public void run() {
        try {
            // Print a message three times with a one-second delay between each message
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " thread here.");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // Handle interrupted exception if needed
            e.printStackTrace();
        }
    }
}

public class COLLEDGE_Runnable {
    public static void main(String args[]) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();
        try {
            // Print a message three times with a one-second delay between each message
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " thread here.");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // Handle interrupted exception if needed
            e.printStackTrace();
        }
    }
}

