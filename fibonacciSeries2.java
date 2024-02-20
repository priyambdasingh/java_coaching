package java_coaching;
//Using switch-case statement, write a menu driven program to perform the following :
//(i)To Generate and display the first 10 terms of the Fibonacci series 0, 1, 1, 2, 3, 5........
//The first two Fibonacci numbers are 0 and 1, and each subsequent number is the sum of the previous two.
// (ii) Find the sum of the digits of an integer that is input.
//Sample Input: 15390  Sample Output: Sum of the digits = 18
//For an incorrect choice, an appropriate error message should be displayed.

import java.util.Scanner;

public class fibonacciSeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int n = sc.nextInt();
//        int a =0;
//        int b =1;
//        System.out.print(a+" "+b+" ");
//        for(int i = 1; i<=n; i++){
//            int c= a+b;
//            System.out.print(c+" ");
//            a=b;
//            b=c;
//        }
        int s=0;
       while(n>0)
       {
           int d=n%10;
           s+=d;
           n=n/10;
       }
       System.out.println(s);
    }
}
