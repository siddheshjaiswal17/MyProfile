//Check Palindrome number or not
import java.lang.*;

class P1b_palindrome {
    public static void main(String arg[]) {
        int num, rev, rem, n;
        num = Integer.parseInt(arg[0]);
        n = num;
        rev = 0;
        while (n != 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        System.out.println("Reverse: " + rev);
        if (num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
