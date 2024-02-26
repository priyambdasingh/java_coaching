package java_coaching;

import java.util.Scanner;

public class functionSum {
    public static void sum(int  n) {
        int s=0;
       while(n>0)
        {
            int d=n%10;
            s+=d;
            n=n/10;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("enter value");
            int n = sc.nextInt();
            sum(n);
        }
    }
}
