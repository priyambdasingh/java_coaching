package java_coaching;

import java.util.Scanner;

public class seprateString {


        public static void main(String[] args) {
            String a;
            System.out.print("enter value ");
            Scanner sc =new Scanner(System.in);
            a = sc.nextLine();
            int l = a.length();
            for(int i =0 ;i<=l-1;i++){
                System.out.println(a.charAt(i));
            }
        }

    }





