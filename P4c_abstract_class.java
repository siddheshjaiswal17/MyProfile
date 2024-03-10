// Write a java program to demonstrate the implementation of abstract class.

import java.util.*;

abstract class Shape {
    public abstract void area();

    void show() {
        System.out.print("\n In Shape");
    }
}

class Circle extends Shape {
    double r, a;

    void get(int m) {
        r = m;
    }

    public void area() {
        a = 3.14 * r * r;
        System.out.print("\n Area of Circle:" + a);
    }
}

class Triangle extends Shape {
    int b, h;
    double a;

    void get(int n, int p) {
        b = n;
        h = p;
    }

    public void area() {
        a = 0.5 * b * h;
        System.out.print("\n Area of Triangle:" + a);
    }
}

class P4c_abstract_class {
    public static void main(String arg[]) {
        int r, b, h;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter Radius:");
        r = sc.nextInt();
        Circle c = new Circle();
        c.get(r);
        c.area();
        Triangle t = new Triangle();
        System.out.print("\n Enter Base:");
        b = sc.nextInt();
        System.out.print("\n Enter Height:");
        h = sc.nextInt();
        t.get(b, h);
        t.area();
    }
}
