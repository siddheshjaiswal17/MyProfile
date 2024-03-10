// Write a program to implement Multiple Inheritance.
import java.util.*;

class Student {
    int rno;
    String name;
    int sp;
    Scanner sc = new Scanner(System.in);

    void get() {
        System.out.print("\nEnter Your Roll no.: ");
        rno = sc.nextInt();
        System.out.print("Enter Your Name: ");
        name = sc.next();
        System.out.print("Do you have Sport Quota (1 : Yes, 0 : No): ");
        sp = sc.nextInt();
    }
}

class Marks extends Student {
    int s1, s2, s3, s4, s5;

    void read() {
        System.out.print("\nEnter marks of Sub1: ");
        s1 = sc.nextInt();
        System.out.print("Enter marks of Sub2: ");
        s2 = sc.nextInt();
        System.out.print("Enter marks of Sub3: ");
        s3 = sc.nextInt();
        System.out.print("Enter marks of Sub4: ");
        s4 = sc.nextInt();
        System.out.print("Enter marks of Sub5: ");
        s5 = sc.nextInt();
    }

    void show() {
        System.out.println("\nRoll no: " + rno + "\nName: " + name + "\nSports Quota: " + sp);
        System.out.println("Sub1: " + s1 + "\nSub2: " + s2 + "\nSub3: " + s3 + "\nSub4: " + s4 + "\nSub5: " + s5);
    }
}

interface Sport {
    final int score = 15;
}

class Result extends Marks implements Sport {
    int total;
    float per;

    void cal() {
        if (sp == 1) {
            total = s1 + s2 + s3 + s4 + s5 + score;
        } else {
            total = s1 + s2 + s3 + s4 + s5;
        }
        per = total / 5;
        System.out.println("\nTotal: " + total);
        System.out.println("Percentage: " + per + "%");
    }
}

class P5c_multiple_inheritance {
    public static void main(String arg[]) {
        Result r = new Result();
        r.get();
        r.read();
        r.show();
        r.cal();
    }
}
