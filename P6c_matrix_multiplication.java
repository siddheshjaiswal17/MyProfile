//Write a java program for multiplying two matrices and print the product for the same.

import java.util.*;

class P6c_matrix_multiplication { 
    public static void main(String arg[]) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int result[][] = new int[2][2];

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

        System.out.println("\nMultiplication of Matrix:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                for (k = 0; k < 2; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(" " + result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
