// Design a class that demonstrates the use of constructor and destructor

import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void validate() {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            int yearsToWait = 18 - age;
            System.out.println("Try after " + yearsToWait + " years");
        }
    }

    @Override
    protected void finalize() {
        System.out.println("Object is garbage collected");
    }
}

class P4b_constructor_desturctor {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Person person = new Person(name, age);
        person.validate();

        person.finalize();
        System.gc();
    }
}
