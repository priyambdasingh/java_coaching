package java_coaching;

import java.util.Scanner;

public class special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int n = sc.nextInt();
        int m = n;
        int s = 0;

        while (n > 0) {
            int d = n % 10;
            int p = 1; // Initialize p inside the loop
            for (int i = 1; i <= d; i++) {
                p *= i;
            }
            s += p;
            n = n / 10;
        }

        if (m == s) {
            System.out.println("special no: " + s);
        } else {
            System.out.println("not special no: " + s);
        }
    }
}

