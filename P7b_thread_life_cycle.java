//Write a java program to implement thread life cycle

import java.util.*;

public class P7b_thread_life_cycle extends Thread {
    public void run() {
        System.out.println("\nThread is running");
    }

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("SYIT");
        System.out.println("After name change: " + t);
        System.out.println("Main thread new priority: " + t.getPriority());

        try {
            for (int i = 0; i < 5; i++) {
                t.sleep(3000);
                System.out.println("Main thread=" + i);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
