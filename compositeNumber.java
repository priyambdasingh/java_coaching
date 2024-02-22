package java_coaching;

import java.util.Scanner;

//Using switch-case statement, write a menu driven program to perform the following :
//To check and display whether the number input by the user is a composite number or not.
//A number is said to be a composite, if it has one or more than one factors excluding 1 and the number itself. Example: 4, 6, 8, 9,....
//(in)
//To find the smallest digit of an integer that is input.
//Sample Input: 6524
//Sample Output: Smallest digit = 2
public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("enter value");
      int n = sc.nextInt();
        int min=9;
        while(n>0) {
            int d = n % 10;
            if (d < min)
                min = d;
            n = n / 10;
        }
        System.out.println("smallest digit"+min);
        }

    }

