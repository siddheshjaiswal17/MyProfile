// Program to find the minimum and maximum of an array

import java.util.*;
class P3c_min_max_of_array {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int size, i;
        System.out.print("\nEnter the array size: ");
        size = sc.nextInt();
        int arr[] = new int[size];
        for (i = 0; i < size; i++) {
            System.out.print("\nEnter value for array: ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0], min = arr[1];
        for (i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum: " + min + " Maximum: " + max);
    }
}
