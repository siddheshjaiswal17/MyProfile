//Multiplication Table
import java.lang.*;
class P1MulTable {
    public static void main(String arg[]) {
        if (arg.length == 0) {
            System.out.println("Please provide a number as command-line argument.");
            return;
        }
        int num = Integer.parseInt(arg[0]);

        System.out.println("Table of " + num);

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
