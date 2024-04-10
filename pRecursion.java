package java_coaching;

import java.util.Scanner;

public class pRecursion {

    void check(int n){
        if(n>=1){
           System.out.print(n+" ");
        check(n-1);
            System.out.print(n*n);
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value n");
        int n =sc.nextInt();
        pRecursion obj  =new  pRecursion();
        obj. check(n);
    }
}

