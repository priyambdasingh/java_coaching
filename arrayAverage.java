package java_coaching;

import java.util.Scanner;

public class arrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any 15 value");
        int n[] = new int [5];
        int s=0;
        for(int i =0; i<5; i++)
        {
            n[i] =sc.nextInt();
            s+=n[i];

        }
        double a = s/5.0;
        System.out.println("print a " + " "+a);
    }
}
