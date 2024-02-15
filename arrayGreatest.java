package java_coaching;

import java.util.Scanner;

public class arrayGreatest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n[]=new  int[10];
        System.out.println("enter any 5 vqlue");
        for(int i =0; i<5; i++)
        {
            n[i]= sc.nextInt();
        }
        int max = n[0];
        for (int i = 1; i<5;i++)
        {
            if (n[i] >max)
            {
                max = n[i];
            }
        }

        int min = n[0];
        for (int i = 1; i<5;i++)
        {
            if (n[i] <min)
            {
                min = n[i];
            }
        }
        System.out.println(max+min);
    }
}
