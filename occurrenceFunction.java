package java_coaching;

import java.util.Scanner;

//Create a function int counter( long num, int d) - that takes arguments num and d as a digit.
// Count and return the occurrence of d (digit) in num if 'd' is present in num otherwise return 0.
// Also, write a main. function to input a long integer number and an integer digit.
// By invoking the function counter() print the occurrence of the digit in the number.
public class occurrenceFunction {



        public static int counter(long num, int d) {
            int count = 0;
            while (num > 0) {
                if (num % 10 == d) {
                    count++;
                }
                num /= 10;
            }
            return count;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter a long integer number: ");
            long num = scanner.nextLong();


            System.out.print("Enter an integer digit: ");
            int d = scanner.nextInt();


            int occurrence = counter(num, d);


            System.out.println("The digit " + d + " occurs " + occurrence + " times in the number " + num+ ".");
        }
    }


