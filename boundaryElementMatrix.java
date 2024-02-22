package java_coaching;

import java.util.Scanner;

public class boundaryElementMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("enter element");
        int s=0;
        for (int i=0; i<=m; i++)
        {
            for(int j =0;j<=n;j++){
                a[i][j] = sc.nextInt();

                if(i==0||i==m-1||j==0||j==n-1)
                {
                   s+=a[i][j];
                }
            }
        }
        System.out.println(s);
    }
}
