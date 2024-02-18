package java_coaching;

import java.util.Scanner;

//Write a menu driven program to accept a number and check and display whether it is a prime number or not OR the same number is an automorphic number or not (use switch-case statement).
// (a) Prime number : A number is said to be a prime number if it is divisible only 1 and itself an not by any other number.
//Example : 3, 5, 7, 11, 13, etc.
// (b) Automorphic number :An automorphic number is the number which is contained in the last
//digit(s) of its square. Example : 25 is an automorphic number as its square is 625 and 25 is present as the last two digits.
//
//
public class primeAutomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n:");
        int n = sc.nextInt();
//               int c = 0;
//                for (int j = 1; j <= n; j++) {
//                    if (n % j == 0) {
//                        c++;
//                    }
//                }
//                if (c == 2) {
//                    System.out.println( n+" is a prime number");
//                }
//                  System.out.println( n+" not is a prime number");
        int square = n * n;
        boolean isIsoMorphic = true;

        while (n > 0) {
            int lastDigit = n % 10;
            int lastDigitOfSquare = square%10;
            if(lastDigit == lastDigitOfSquare){
                n = n / 10;
                square = square/10;
            }
            else{
                isIsoMorphic = false;
                System.out.println("not an isomorphic");
                break;
            }

        }
        if(isIsoMorphic)
            System.out.println("isomorphic number");

    }
}








