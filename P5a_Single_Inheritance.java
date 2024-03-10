// Write a java program to implement single level inheritance
import java.util.*;

class Bank {
    int r = 6;

    void disp() {
        System.out.println("The interest rate is " + r);
    }
}

class SBI extends Bank {
    double SI;

    void simple(int p, int y) {
        SI = (p * r * y) / 100.0;
    }

    void display() {
        System.out.println("Simple interest is: " + SI);
    }
}

class P5a_Single_Inheritance {
    public static void main(String arg[]) {
        int p, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter principal Amount: ");
        p = sc.nextInt();
        System.out.print("Enter number of years: ");
        y = sc.nextInt();
        SBI lunch = new SBI();
        lunch.disp();
        lunch.simple(p, y);
        lunch.display();
    }
}
