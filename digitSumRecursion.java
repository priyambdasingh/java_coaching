package java_coaching;

import java.util.Scanner;

public class digitSumRecursion {
    int s=0;
    void digitSum(int n){
        if(n>0){
            int d=n%10;
            s+=d;
            n=n/10;
            digitSum(n);
        }else{
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value n");
        int n =sc.nextInt();
        digitSumRecursion obj  =new digitSumRecursion();
        obj.digitSum(n);
    }
}
