//Pattern Program
import java.util.*;

class P1d_patternprog {
    public static void main(String arg[]) {
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
