package java_coaching;

import java.util.Scanner;

//Using switch-case statement, write a menu driven program to perform the following :
//(1)
//To find and display the factors of a number input by the user, including 1 and excluding itself.
//Sample Input: 15
//Sample Output: 1, 3, 5
public class factorialSeeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int n = sc.nextInt();
        for (int i = 1; i<=n-1; i++){
           if (n%i==0){
               System.out.println(i);
           }
        }

    }
}
