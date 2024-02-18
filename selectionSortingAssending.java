package java_coaching;

import java.util.Scanner;

public class selectionSortingAssending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int n[]=new int[5];
        for(int i =0; i<5; i++)
        {
            n[i]= sc.nextInt();
        }
        for (int i = 0; i<5; i++)
        {
          int  min =n[i];
           int  p=i;
            for(int j=i+1; j<5; j++)
            {
                if(n[j]<min)
                {
                  min=n[i];
                  p=j;
                }
            }
            int t =n[i];
            n[i]=n[p];
            n[p]=t;

        }
        for(int i = 0; i<5;i++)
        {
            System.out.println(n[i]);
        }


    }
}
