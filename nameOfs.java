package java_coaching;

import java.util.Scanner;

public class nameOfs {
    public static void main(String[] args) {
        String a;
        System.out.print("enter value ");
        Scanner sc =new Scanner(System.in);
        a = sc.nextLine();
        char ch =a.charAt(0) ;
        System.out.println(ch);
        char h =a.charAt(a.length()-1) ;
        System.out.println(h);
    }

}
