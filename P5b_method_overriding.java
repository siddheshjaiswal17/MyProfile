// Write a java program to implement Method overriding.
import java.util.*;

class Bank {
    int getRate() {
        return 0;
    }
}

class SBI extends Bank {
    int getRate() {
        return 5;
    }
}

class HDFC extends Bank {
    int getRate() {
        return 7;
    }
}

class BOI {
    int getRate() {
        return 9;
    }
}

class P5b_method_overriding {
    public static void main(String arg[]) {
        SBI s = new SBI();
        HDFC h = new HDFC();
        BOI b = new BOI();
        System.out.println("\nRate of interest in SBI = " + s.getRate() + "%");
        System.out.println("Rate of interest in HDFC = " + h.getRate() + "%");
        System.out.println("Rate of interest in BOI = " + b.getRate() + "%");
    }
}
