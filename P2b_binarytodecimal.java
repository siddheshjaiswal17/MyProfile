//convert a number from binary to decimal
import java.util.Scanner;

class P2b_binarytodecimal {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a Binary Number: ");
        long num = sc.nextLong();
        int sum = 0, pos = 0, rem = 0;
        while ((int) num != 0) {
            sum = sum + (int) (num % 10) * (int) (Math.pow(2, pos));
            num = num / 10;
            pos++;
        }
        System.out.print("\nDecimal Number: " + sum);
    }
}
