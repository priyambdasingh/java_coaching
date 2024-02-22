package java_coaching;

import java.util.Scanner;

public class sumOfColumn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("entr the size as row &colum");
        int m = sc.nextInt();
        int n= sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("enter value");
        int s=0;
        for (int i = 0; i < m; i++) {
            for(int j =0; j<n; j++) {
                a[i][j] = sc.nextInt();

            }
            s+= a[i][n-1];


        }
        System.out.print("sumOfColumn" +"  "+s);
    }
}
