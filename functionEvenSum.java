package java_coaching;

import java.util.Scanner;

public class functionEvenSum {

    public static void evenSum(int a,int b) {
            int s=0;
           s=a+b;
           if(s%2==0){
            System.out.println(s+ " "+ "even number");
        }else{
               System.out.println(s+ " "+ "odd number");
           }
    }

        public static void main(String[] args) {
            {
                Scanner sc = new Scanner (System.in);
                System.out.println("enter value a");
                int a = sc.nextInt();
                System.out.println("enter value b");
                int b = sc.nextInt();
                evenSum(a,b);
            }
        }
    }


