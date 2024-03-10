//Write a java program to implement multithreading

import java.util.*;

class MultithreadingDemo extends Thread {
    String name;

    MultithreadingDemo(String n) {
        name = n;
        System.out.println("Creating: " + name);
    }

    public void run() {
        System.out.println("Running " + name);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread " + name + " " + i);
                sleep(5000);
            }
        } catch (Exception e) {
            System.out.println("Exception is caught ");
        }
        System.out.println("Thread " + name + " exiting ");
    }
}

public class P7cMultithreading {
    public static void main(String arg[]) throws InterruptedException {
        MultithreadingDemo child1 = new MultithreadingDemo("Child1");
        child1.start();
        MultithreadingDemo child2 = new MultithreadingDemo("Child2");
        child2.start();
    }
}
