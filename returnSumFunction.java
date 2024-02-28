package java_coaching;

import java.util.Scanner;

public class returnSumFunction {

        public static int Sum(int a,int b) {

          int   s=a+b;
          return s;

        }

        public static void main(String[] args) {
            {
                Scanner sc = new Scanner (System.in);
                System.out.println("enter value a");
                int a = sc.nextInt();
                System.out.println("enter value b");
                int b = sc.nextInt();
                int c=Sum(a,b);
                System.out.println("sum is" +c);

            }
        }

    }




