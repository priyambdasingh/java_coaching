package java_coaching;

import java.util.Scanner;

public class arrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any 15 value");
        int n[] = new int [15];
        int s=0;
        for(int i =0; i<=15; i++)
        {
            n[i] =sc.nextInt();
            s+=n[i];
            System.out.println(s);
        }
        int a = s/15;
        System.out.println(a);
    }
}
