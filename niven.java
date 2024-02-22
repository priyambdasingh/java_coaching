package java_coaching;

import java.util.Scanner;

//Nive number is that number which is divisible by its sum of digits).
//Example Ter: 126, its sum of digits = 1+2+6=9 and 126 is divisible by 9.
//So 126 is Niven.
public class niven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int n= sc.nextInt();
        int m =n;
        int s=0;
        while(n>0){
            int d =n%10;
            s+=d;
            n=n/10;
        }

        if(m%s==0) {
            System.out.println("niven no");
        }
        else{
            System.out.println(" not niven no");
        }
    }
}
