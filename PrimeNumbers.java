package java_coaching;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n:");
        int n = sc.nextInt();
        System.out.println("Enter value for m:");
        int m = sc.nextInt();
        int c = 0;
        for (int k = n; k <= m; k++) {

            for (int j = 1; j <= k; j++) {
                if (k % j == 0) {
                   c++;
                }
            }
            if (c == 2) {
                System.out.println( " is a prime number");
            } else {
                System.out.println( " is not a prime number");
            }
        }
    }
}
