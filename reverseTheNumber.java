package java_coaching;
//Write a program to return the reverse of a number
//Input
//n=123
//output
//321
import java.util.*;
class Main
{

    public static int reverse(int n)
    {
        /* Function to return the reverse of a number n */
        int rev=0;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;

    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        int output = reverse(n);
        System.out.println(output);
    }
}
