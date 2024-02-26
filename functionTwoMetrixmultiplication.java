package java_coaching;

import java.util.Scanner;

public class functionTwoMetrixmultiplication {
    public static void display(int M[][])
    {
        for (int i = 0; i <M.length; i++) {
            for (int j = 0; j <M[0].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the matrices:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("first matrix is");
        display(a);
        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("second matrix is");
        display(b);
;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int s=0;
                for(int k=0; k<n;k++) {
                    s += a[i][k] * b[k][j];
                }
                c[i][j]=s;
            }
        }

        System.out.println("Resultant matrix after multification:");
        display(c);
    }
}


