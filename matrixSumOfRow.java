package java_coaching;

import java.util.Scanner;

public class matrixSumOfRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n[][] = new int[4][4];
            System.out.println("enter any 5 vqlue");
            int s=0;
            for (int i = 0; i < 4; i++) {
                for(int j =0; j<4; j++) {
                    n[i][j] = sc.nextInt();
                }
                s = n[0][0] + n[0][1] + n[0][2] + n[0][3];

            }
        System.out.print(s);
        }


    }
