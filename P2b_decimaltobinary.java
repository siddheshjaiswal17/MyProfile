//Decimal number to Binary Number
import java.util.Scanner;

class P2b_decimaltobinary {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a Decimal Number: ");
        int num = in.nextInt();
        long binary = 0;
        int place = 1, rem = 0;
        while (num != 0) {
            rem = num % 2;
            binary += rem * place;
            place *= 10;
            num /= 2;
        }
        System.out.println("Binary: " + binary);
    }
}
