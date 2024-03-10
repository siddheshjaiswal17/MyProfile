//Write a java program to implement exception handling.

import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

class CustomException1 {
    void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("\nAge is not valid for Driving License");
        } else {
            System.out.println("\nAge valid for Driving License....Go for test");
        }
    }
}

public class P9c_exception_handling {
    public static void main(String arg[]) {
        int age;
        Scanner sc = new Scanner(System.in);
        CustomException1 error = new CustomException1();
        System.out.print("Enter age = ");
        age = sc.nextInt();
        try {
            error.validate(age);
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the Exception ");
            System.out.println("Exception Occurred: " + ex);
        }
    }
}
