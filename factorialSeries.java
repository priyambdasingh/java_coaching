package java_coaching;

import java.util.Scanner;

//w.a.p to input a limit (Number of terms) thenfactorial series up to the limit up to the limit .
public class factorialSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter no of terms");
        int n =sc.nextInt();
        int s= 0;
        for(int i=1;i<=n;i++)
        {
            int p =1;
            for(int j=1; j<=i; j++)
            {
                p*=j;
            }
            s+=p;
        }
        System.out.println("sum is " + s);
    }
}
