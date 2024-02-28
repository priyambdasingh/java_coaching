package java_coaching;

import java.util.Scanner;

public class callByRef {
    public static void change(int a[]) {
        for(int i =0;i<a.length;i++)
        {
            a[i]*=2;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int [5];
        System.out.println("enter any 5 values");
        for(int i =0 ; i<5;i++){
            a[i]= sc.nextInt();
        }

        change(a);
        System.out.println("new value ");
        for (int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}
