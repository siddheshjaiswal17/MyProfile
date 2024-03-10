//sum of individual digits
import java.util.Scanner;

class P1c_sumofdigit {
    public static void main(String arg[]) {
        int num, rem, sum, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = sc.nextInt();
        n = num;
        sum = 0;
        while (n != 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("Sum: " + sum);
    }
}
