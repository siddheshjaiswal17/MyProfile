// Write a Java program to count the letters, spaces, numbers and other characters of an input string.

import java.util.*;

class Prac3A {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a String: ");
        String str = sc.nextLine();
        int letter = 0, space = 0, digit = 0, other = 0;
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                digit++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("\nLetters: " + letter);
        System.out.println("Digits: " + digit);
        System.out.println("Spaces: " + space);
        System.out.println("Others: " + other);
    }
}
