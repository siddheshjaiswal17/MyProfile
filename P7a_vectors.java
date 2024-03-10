//Write a java program to implement the vectors.

import java.io.*;
import java.util.*;

class P7a_vectors {
    public static void main(String[] args) {
        int n = 5, data;
        Scanner in = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>(n);
        
        for (int i = 1; i <= n; i++) {
            System.out.print("\nEnter Element:");
            data = in.nextInt();
            v.add(data);
        }
        
        System.out.println("\nDisplay whole vector=" + v);
        System.out.println("\tCapacity=" + v.capacity());
        System.out.println("\tSize=" + v.size());
        
        v.remove(3);
        
        System.out.println("After Deleting element=" + v);
        System.out.println("\tAfter Deleting Capacity=" + v.capacity());
        System.out.println("\tAfter Deleting Size =" + v.size());
        
        System.out.print("\tTaking individual element=");
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
        
        v.add(10);
        
        System.out.print("\nAfter Adding Element " + v + " ");
        System.out.print("\nFirst Element =" + v.firstElement());
        System.out.print("\nLast Element=" + v.lastElement());
        
        v.add(70);
        
        System.out.print("\nAfter Adding Element " + v + " ");
        System.out.print("\nFirst Element =" + v.firstElement());
        System.out.print("\nLast Element=" + v.lastElement());
    }
}
