// Write a java program to add two matrices and print the resultant matrix.

import java.util.*;

class P6b_matrix_addition {
    public static void main(String arg[]) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        
        System.out.println("Enter values for Matrix1:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter values for Matrix2:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nDisplay Matrix1:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nDisplay Matrix2:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(" " + b[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nAddition of Matrix:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(" " + (a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
