package java_coaching;
import java.util.Scanner;
public class series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int n= sc.nextInt(); // Change the value of n to the desired number of terms
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            int p = 1;
            int Sum = 0;

            for (int j = 1; j <= i; j++) {
                 p*= j;
                Sum += j;
            }

            sum += Sum / (double) p;
        }

        System.out.println("Sum of the series up to " + n + " terms: " + sum);
    }
}

