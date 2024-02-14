package java_coaching;

import java.util.Scanner;

public class greattestvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value a");
        int a = sc.nextInt();
        System.out.println("enter value b");
        int b = sc.nextInt();
        System.out.println("enter value c");
        int c = sc.nextInt();
        if(a>b&&a>c){
            System.out.println("a" +a);
          }else if(b>a&&b>c){
            System.out.println("b" +b);
          }else {
            System.out.println("c" +c);
        }
    }
}
