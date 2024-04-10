package java_coaching;
import java.util.*;
//Print the following pattern using while loops
//*****
//****
//***
//**
//*
public class patternWhileLoop {
    public static void print_pattern()
        {
            int i = 5;
            while (i >= 1) {
                int j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i--;
            }
        }
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            print_pattern();
        }
    }

