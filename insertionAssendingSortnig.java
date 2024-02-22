package java_coaching;

import java.util.Scanner;

public class insertionAssendingSortnig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        System.out.println("Enter any 5 values:");
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 1; i < 5; i++) {
            int key = n[i];
            int j = i - 1;
            while (j >= 0 && n[j] > key) {
                n[j + 1] = n[j];
                j--;
            }
            n[j + 1] = key;
        }
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < 5; i++) {
            System.out.println(n[i]);
        }
    }
}
