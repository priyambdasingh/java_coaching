package java_coaching;

import java.util.Scanner;

public class sumOfColumn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value");
        int n[][]=new int[4][4];
        int s=0;
        for (int i = 0; i < 4; i++) {
            for(int j =0; j<4; j++) {
                n[i][j] = sc.nextInt();

            }
            s = n[0][3] + n[1][3] + n[2][3] + n[3][3];


        }
        System.out.print("sumOfColumn" +"  "+s);
    }
}
