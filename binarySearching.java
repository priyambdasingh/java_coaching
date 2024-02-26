package java_coaching;

import java.util.Scanner;

public class binarySearching {
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
        int l=0,u=n-1,m;
       while(l<=u)
        {
            m=(l+u)/2;
            if(s==a[m]){
                System.out.println("value found");
                System.exit(0);
            }else if(s>a[m])
            {
                l=m+1;
            }else{
                u =m-1;
            }

        }
        System.out.println("value not found");

    }

}
