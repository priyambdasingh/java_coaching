package java_coaching;

import java.util.Scanner;

//9. Design a function int Factorial(int num) to return the factorial of argument num.
//The factorial of num is calculated by taking the product of all the numbers from num to 1.
//For example: Input num = 4, then factorial of num (num!) = 4 x 3 x 2 x 1 = 24.
 class functionFactorial {
     void factorial(int n){
         int p =1;
         for(int i =1; i<=n; i++){
             p*=i;
         }
         System.out.print("factorial" + " "+p);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int n= sc.nextInt();
        functionFactorial ns = new functionFactorial();
        ns.factorial(n);
    }
}
