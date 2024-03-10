//Implement a Java function that calculates the sum of digits for a given char array 
//consisting of the digits '0' to '9'. The function should return the digit sum as a long value

import java.util.*;

class P3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string which includes numbers: ");
        String str = input.nextLine();
        char ch[] = str.toCharArray();
        long digitSum = calculateDigitSum(ch);
        System.out.println("Sum: " + digitSum);
    }

    public static long calculateDigitSum(char[] ch) {
        long sum = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                sum += ch[i] - '0';
            }
        }
        return sum;
    }
}
