package java_coaching;

import java.util.Scanner;

public class twoMetrixmultiplication {

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
            System.out.println("Enter elements for second matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int s=0;
                    for(int k=0; k<n;k++) {
                        s += a[i][k] * b[k][j];
                    }
                    c[i][j]=s;
                }
            }

            System.out.println("Resultant matrix after addition:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


