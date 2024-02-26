package java_coaching;

import java.util.Scanner;

public class linearSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any size");
        int n = sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter "+n+"Values in the array");
                for(int i =0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter any searching value");
        int s= sc.nextInt();

       for(int i=0;i<n;i++)
       {
        if(s==a[i]){
                System.out.println("value found");
                System.exit(0);
            }

        }
        System.out.println("value not found");

        }

    }

