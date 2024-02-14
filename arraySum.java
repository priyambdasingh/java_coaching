package java_coaching;

import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any 15 value");
        int a[] = new int [15];
        int s=0;
        for(int i =0; i<=15; i++)
        {
            a[i] =sc.nextInt();
            s+=a[i];
            System.out.println(s);
        }

    }
}
