//Reverse of string
import java.util.*;

class P2c_stringreverse {
    public static void main(String arg[]) {
        String str;
        String revstr = " ";
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        str = sc.nextLine();
        for (i = str.length() - 1; i >= 0; i--) {
            revstr = revstr + str.charAt(i);
        }
        System.out.print("\nReversed String: " + revstr);
    }
}
