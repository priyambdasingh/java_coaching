package java_coaching;

import java.util.Scanner;

public class diagonalMatrix {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter value");
            int n[][]=new int[4][4];
            int s=0;
            for (int i = 0; i < 4; i++) {
                for(int j =0; j<4; j++) {
                    n[i][j] = sc.nextInt();

                }
                s = n[0][0] + n[1][1] + n[2][2] + n[3][3];


            }
        System.out.print("diagonalMatrix" +"  "+s);
        }
    }


