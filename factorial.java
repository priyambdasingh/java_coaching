package java_coaching;
//Write a program to accept an integer. Print whether the integer is a special number or not.

import java.util.Scanner;

//if the sum of the factorial of each digit of a number is same as the original number then the number is special
//  Example: 145 is a special number, because 1!+4!+5!=1+24+120=145 symbol ! means factorial of a number which is product of
// all integers from 1 to that number (4!=1*2*3*4=24)
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= n;
        int sum = 0;
        int p=1;
        while(n>0){
            int d=n%10;

            for (int j = 1; j<=d;j++){
                p*=j;
            }
            n=n/10;
            sum+=p;
            p=1;

        }

        if(m==sum){
            System.out.println("special number");
        }else {
            System.out.println("not special number");
        }
    }

}
