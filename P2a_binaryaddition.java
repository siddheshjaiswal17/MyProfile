//Binary number addition
import java.util.*;

class P2a_binaryaddition {
    public static void main(String arg[]) {
        long b1, b2;
        int i = 0, carry = 0;
        int sum[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter 1st binary number: ");
        b1 = sc.nextLong();
        System.out.print("\nEnter 2nd binary number: ");
        b2 = sc.nextLong();
        while (b1 != 0 || b2 != 0) {
            sum[i++] = (int) ((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int) ((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("\nAddition is: ");
        while (i >= 0) {
            System.out.print(sum[i]);
            i--;
        }
    }
}
