package java_coaching;

import java.util.Scanner;

//w.a.p to input a limit (Number of terms) then print febonacci series up to the limit up to the limit .
public class febonacciSeris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter terms of number");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i =1; i<=n-2; i++){
            int c= a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
