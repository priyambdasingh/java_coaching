package java_coaching;

import java.util.Scanner;

//A special two-digit number is such that when the sum of its digits is added to the product of its a result is equal to the original two-digit number.
//Example: Let a number 59, its Sum of digits = 5 + 9 = 14 and Product of its digits = 5 × 9 = 45
//Sum of the sum of digits and product of digits = 14 + 45 = 59
//Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits. If the value is equal to the number input, output the message "Special 2-digit number" otherwise, output the message
//"Not a Special 2-digit number"
import java.util.Scanner;

public class specialTwoDigit {
    public static void main(String[] args) {
        System.out.println("enter value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int s = 0;
        int p = 1;

        while (n > 0) {
            int d = n % 10;
            s += d;
            p *= d;
            n = n / 10;
        }
        int sum = s + p;
        if(m==sum) {
            System.out.println("Special 2-digit number"+ sum);
        }else{
            System.out.println("Special not 2-digit number"+ sum);
        }
    }
}

