package java_coaching;

import java.util.Scanner;

//w.a.p to input a limit (Number of terms) then print sum of following series up to the limit up to the limit .
public class sumof2DifSerie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter no of terms");
        int n =sc.nextInt();
        int s= 0;
        for(int i=1;i<=n;i++)
        {
            s+=i*2;
        }
        System.out.println("sum is " + s);
    }
}
