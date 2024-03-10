// Program to perform ascending and descending sorting of an array

import java.util.*;
class Sort{
    void asc(int a[], int sz) {
        int i, j, t;
        for (i = 0; i < sz; i++) {
            for (j = i + 1; j < sz; j++) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.print("\nAscending Array: ");
        for (i = 0; i < sz; i++) {
            System.out.print(a[i] + " ");
        }
    }

    void desc(int a[], int sz) {
        int i, j, t;
        for (i = 0; i < sz; i++) {
            for (j = i + 1; j < sz; j++) {
                if (a[i] < a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.print("\nDescending Array: ");
        for (i = 0; i < sz; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

class P4a_asc_desc_array  {
    public static void main(String arg[]) {
        int size, i;
        Scanner sc = new Scanner(System.in);
        Sort s = new Sort();
        System.out.print("\nEnter size for Array:");
        size = sc.nextInt();
        int arr[] = new int[size];
        for (i = 0; i < size; i++) {
            System.out.print("\nEnter values for array:");
            arr[i] = sc.nextInt();
        }
        s.asc(arr, size);
        s.desc(arr, size);
    }
}
