//calculate area perimeter of circle

import java.util.*;

class Circle {
    double area, p;
    int r;

    Circle(int r) {
        this.r = r;
    }

    void area() {
        area = 3.14 * r * r;
        System.out.print("\nArea of Circle: " + area);
    }

    void perimeter() {
        p = 2 * 3.14 * r;
        System.out.println("\nPerimeter of Circle: " + p);
    }
}

class P1e_areaperiofcircle {
    public static void main(String arg[]) {
        int r, ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Radius: ");
        r = sc.nextInt();
        Circle c = new Circle(r);
        do {
            System.out.print("\n\n1. Area of Circle\n2. Perimeter of Circle\n3. Exit");
            System.out.print("\nEnter your Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    c.area();
                    break;
                case 2:
                    c.perimeter();
                    break;
                case 3:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Invalid Choice...");
                    break;
            }
        } while (ch != 3);
    }
}
